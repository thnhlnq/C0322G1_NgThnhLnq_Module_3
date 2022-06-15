use quan_ly_ban_hang;

insert into customer
values (1, 'Minh Quan', 10),
       (2, 'Ngoc Oanh', 20),
       (3, 'Hong Ha',   50);
       
insert into `order`
values (1, 1, '2006-03-21', null),
       (2, 2, '2006-03-23', null), 
       (3, 1, '2006-03-16', null);
       
insert into product 
values (1, 'May Giat', 3),
       (2, 'Tu Lanh',  5),
       (3, 'Dieu Hoa', 7),
       (4, 'Quat',     1),
       (5, 'Bep Dien', 2);
       
insert into order_detail
values (1, 1, 3),
       (1, 3, 7),
       (1, 4, 2),
       (2, 1, 1),
       (3, 1, 8),
       (2, 5, 4),
       (2, 3, 3);
       
select o_id, o_date, o_total_price
from `order`;

select customer.c_name, product.p_name from customer
join `order` on customer.c_id = `order`.c_id
join order_detail on `order`.o_id = order_detail.o_id
join product on order_detail.p_id = product.p_id;

select customer.*, count(`order`.c_id) as so_luong from customer
left join `order` on customer.c_id = `order`.c_id
group by c_id having so_luong = 0;

select  `order`.o_id, `order`.o_date, order_detail.od_qty, product.p_price, order_detail.od_qty * product.p_price as gia_tien
from `order`
join order_detail on `order`.o_id = order_detail.o_id
join product on order_detail.p_id = product.p_id;
