-- Task 8 --

/* Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau. */

-- Cách 1 --

select khach_hang.ho_ten from khach_hang
group by ho_ten
having count(ho_ten) > 1;

-- Cách 2 --

/* select distinct khach_hang.ho_ten from khach_hang
where */ 