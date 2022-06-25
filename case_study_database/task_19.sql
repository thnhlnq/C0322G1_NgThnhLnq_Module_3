-- Task 19 --

/* Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi. */

SET SQL_SAFE_UPDATES = 0;

UPDATE dich_vu_di_kem SET dich_vu_di_kem.gia = dich_vu_di_kem.gia * 2; 

SELECT dich_vu_di_kem.ma_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem FROM dich_vu_di_kem
LEFT JOIN hop_dong_chi_tiet ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
JOIN hop_dong ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
WHERE YEAR(hop_dong.ngay_lam_hop_dong) BETWEEN 2019 AND 2021 
GROUP BY ma_dich_vu_di_kem 
HAVING dich_vu_di_kem.ma_dich_vu_di_kem NOT IN (
SELECT dich_vu_di_kem.ma_dich_vu_di_kem FROM dich_vu_di_kem 
JOIN hop_dong_chi_tiet ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
WHERE so_luong < 10); 
