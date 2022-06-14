-- Task 2 --

select * 
from case_study.nhan_vien
where (ho_va_ten like 'H%' or ho_va_ten like 'T%' or ho_va_ten like 'K%') 
   and character_length (ho_va_ten) <= 15;