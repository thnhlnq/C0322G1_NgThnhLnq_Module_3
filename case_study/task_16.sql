-- Task 16 --

/* Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021. */ 

SET SQL_SAFE_UPDATES = 0;

UPDATE nhan_vien SET `status` = 1
WHERE nhan_vien.ma_nhan_vien IN (
SELECT * FROM (
SELECT nhan_vien.ma_nhan_vien FROM nhan_vien
LEFT JOIN hop_dong ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
WHERE nhan_vien.ma_nhan_vien NOT IN (
SELECT nhan_vien.ma_nhan_vien FROM nhan_vien
JOIN hop_dong ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
GROUP BY ma_nhan_vien)) temp);

SELECT nhan_vien.ma_nhan_vien, nhan_vien.ho_ten FROM nhan_vien WHERE `status` = 1; 
