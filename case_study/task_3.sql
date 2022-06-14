-- Task 3 --

select * from case_study.khach_hang
where round(datediff(curdate(), ngay_sinh) / 365, 0) >= 18
and round(datediff(curdate(), ngay_sinh) /365, 0) <= 50 
and (dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng Trị');