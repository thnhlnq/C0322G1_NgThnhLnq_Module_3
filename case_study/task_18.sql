-- Task 18 --

/* Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng). */ 

SET SQL_SAFE_UPDATES = 0;

UPDATE khach_hang SET `status` = 1
WHERE khach_hang.ma_khach_hang IN (
SELECT * FROM (
SELECT khach_hang.ma_khach_hang FROM khach_hang
JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
WHERE YEAR(ngay_lam_hop_dong) < 2021) temp);

SELECT khach_hang.ma_khach_hang, khach_hang.ho_ten FROM khach_hang WHERE `status` = 1;