-- Task 6 --

/* Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3). */

SELECT 
    dich_vu.ma_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM dich_vu
JOIN loai_dich_vu ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
JOIN hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
GROUP BY ma_dich_vu
HAVING dich_vu.ma_dich_vu NOT IN (SELECT dich_vu.ma_dich_vu
FROM dich_vu
JOIN loai_dich_vu ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
JOIN hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
WHERE MONTH(ngay_lam_hop_dong) BETWEEN 1 AND 3)
ORDER BY chi_phi_thue DESC;
