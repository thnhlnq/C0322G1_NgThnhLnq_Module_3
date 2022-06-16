-- Task 5 --

/* Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
(Với tổng tiền được tính theo công thức như sau: 
Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
cho tất cả các khách hàng đã từng đặt phòng.
(những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). */

use case_study;

select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, dich_vu.ten_dich_vu,
 hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
 ifnull(dich_vu.chi_phi_thue, 0) + ifnull(hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia, 0) as tong_tien from loai_khach
 left join khach_hang on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
 left join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
 left join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
 left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
 left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
 group by ma_khach_hang
 order by ma_khach_hang asc;
 