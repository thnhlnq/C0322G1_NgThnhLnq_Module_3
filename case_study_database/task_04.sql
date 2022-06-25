-- Task 4 --

/* Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”. */

SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    COUNT(hop_dong.ma_khach_hang) AS so_lan_dat_phong
FROM loai_khach
JOIN khach_hang ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
WHERE ten_loai_khach = 'Diamond'
GROUP BY ma_khach_hang
ORDER BY so_lan_dat_phong ASC;