use quan_ly_sinh_vien;

select * from student
where student_name like 'h%';

select * from class
where month(start_date) = 12;

select * from `subject`
where 3 <= credit and credit <= 5;

set sql_safe_updates = 0;
update class set class_id = 2 where student_name like 'Hung';

select student_name, sub_name, mark 
from student, `subject`, mark 
order by mark desc;