-- Task 23 --

/* Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó với ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang. */

delimiter //
create procedure sp_xoa_khach_hang (ma_khach_hang int)
begin 
delete from khach_hang where ho_ten = '%Nghệ';
end;
// delimiter ;

call sp_xoa_khach_hang (1);