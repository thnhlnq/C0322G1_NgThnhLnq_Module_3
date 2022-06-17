-- Task 9 --

/* Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng. */
 
 SELECT 
    MONTH(ngay_lam_hop_dong) AS thang,
    COUNT(ngay_lam_hop_dong) AS so_luong_khach_hang
FROM hop_dong
WHERE YEAR(ngay_lam_hop_dong) = 2021
GROUP BY thang
ORDER BY thang;