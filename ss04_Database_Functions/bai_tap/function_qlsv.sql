use quan_ly_sinh_vien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất. --

select `subject`.*, max(`subject`.credit) as max_credit from `subject`
group by `subject`.credit
having max(`subject`.credit) >= all (select max(`subject`.credit) from `subject` group by `subject`.credit);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất. --

select `subject`.*, mark.mark from `subject`
join mark on `subject`.sub_id = mark.sub_id
group by sub_id
having max(mark.mark) >= all (select max(mark.mark) from mark group by mark.mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần --

select student.*, avg(mark.mark) as `avg`
from student 
join mark on student.student_id = mark.student_id
group by (student_id)
order by mark desc;
