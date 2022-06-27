-- Task 22 --

/* Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này. */

set sql_safe_updates = 0;

update v_nhan_vien set dia_chi = '%Liên Chiểu';

select * from v_nhan_vien;