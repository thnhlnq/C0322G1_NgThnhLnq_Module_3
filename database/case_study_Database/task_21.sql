-- Task 21 -- 

/* Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Đà Nẵng” và đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “2020-07-14”. */ 

drop view v_nhan_vien;

create view v_nhan_vien as
select nhan_vien.ma_nhan_vien, nhan_vien.ho_ten, nhan_vien.dia_chi, hop_dong.ngay_lam_hop_dong from nhan_vien
join hop_dong on nhan_vien.ma_nhan_vien = hop_dong.ma_hop_dong
group by ma_nhan_vien
having dia_chi like '%Đà Nẵng' and ngay_lam_hop_dong = '2020-07-14';

select * from v_nhan_vien;