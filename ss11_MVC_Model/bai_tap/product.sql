drop database if exists product_management;

create database if not exists product_management;

use product_management;

create table products (
id int primary key auto_increment,
`name` varchar(45),
price double,
`description` varchar(45),
producer varchar(45)
);

insert into products (`name`, price, `description`, producer)
values ('Aspire', 1000, 'Good', 'Acer'),
       ('Macbook', 1500, 'Excellent', 'Apple'),
       ('ROG', 1200, 'Good', 'Asus'),
       ('Inspiron', 1400, 'Excellent', 'Dell');