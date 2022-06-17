-- Task 16 --

/* Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021. */ 

SELECT 
    nhan_vien.ma_nhan_vien, 
    nhan_vien.ho_ten
FROM nhan_vien
LEFT JOIN trinh_do ON nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
LEFT JOIN bo_phan ON nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
LEFT JOIN hop_dong ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
GROUP BY ma_nhan_vien
HAVING COUNT(hop_dong.ngay_lam_hop_dong) < 1
    -- AND (YEAR(hop_dong.ngay_lam_hop_dong) BETWEEN 2019 AND 2021)
ORDER BY ma_nhan_vien;
