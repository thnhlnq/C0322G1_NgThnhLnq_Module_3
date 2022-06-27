use quan_ly_sinh_vien;

select * from student
where student_name like 'h%';

select * from class
where month(start_date) = 12;

select * from `subject`
where 3 <= credit and credit <= 5;

set sql_safe_updates = 0;
update student set class_id = 2 where student_name like 'Hung';

select student.student_name , `subject`.sub_name,  mark.mark from student
join mark on student.student_id = mark.student_id
join `subject` on mark.sub_id = `subject`.sub_id
order by mark desc, student_name asc;