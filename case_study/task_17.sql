-- Task 17 --

/* Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ. */ 

SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    loai_khach.ten_loai_khach
FROM loai_khach
JOIN khach_hang ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
JOIN dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
WHERE IFNULL(dich_vu.chi_phi_thue, 0) + IFNULL(hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia, 0)
GROUP BY ma_khach_hang
HAVING loai_khach.ten_loai_khach LIKE 'Platinum'
