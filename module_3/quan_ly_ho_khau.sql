drop database if exists quan_li_ho_khau;

create database if not exists quan_li_ho_khau;

use quan_li_ho_khau;

create table ho_khau
(
    ma_ho_khau       varchar(45) primary key,
    ten_chu_ho       varchar(45),
    so_thanh_vien    int,
    ngay_lap_ho_khau date,
    dia_chi          varchar(45)
);

create table thanh_vien
(
    cmnd       int primary key,
    ho_ten     varchar(45),
    ngay_sinh  date,
    ma_ho_khau varchar(45),
    foreign key (ma_ho_khau) references ho_khau (ma_ho_khau)
);

insert into ho_khau (ma_ho_khau, ten_chu_ho, so_thanh_vien, ngay_lap_ho_khau, dia_chi)
values ('HK-001', 'Nguyễn Văn A', 3, '2016-08-07', 'K12/123 Nguyễn Tất Thành'),
       ('HK-112', 'Nguyễn Văn C', 2, '2019-08-10', '8 Hùng Vương'),
       ('HK-223', 'Tôn Nữ D', 5, '2020-01-11', '10 Lê Duẩn');

insert into thanh_vien (cmnd, ho_ten, ngay_sinh, ma_ho_khau)
values (123456789, 'Nguyễn Văn A', '1995-10-10', 'HK-001'),
       (987456321, 'Nguyễn Văn C', '1994-11-11', 'HK-112'),
       (741258963, 'Tôn Nữ D', '1993-12-12', 'HK-223');