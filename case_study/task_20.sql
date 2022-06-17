-- Task 20 --

/* Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống,
 thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi. */ 
 
 SELECT 
    nhan_vien.ma_nhan_vien,
    nhan_vien.ho_ten,
    nhan_vien.email,
    nhan_vien.so_dien_thoai,
    nhan_vien.ngay_sinh,
    nhan_vien.dia_chi
FROM nhan_vien 
UNION
 SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    khach_hang.email,
    khach_hang.so_dien_thoai,
    khach_hang.ngay_sinh,
    khach_hang.dia_chi
FROM khach_hang