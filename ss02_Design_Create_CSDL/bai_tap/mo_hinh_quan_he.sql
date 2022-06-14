create database mo_hinh_quan_he;

use mo_hinh_quan_he;

create table phieu_xuat (
so_px int not null primary key,
ngay_xuat date
);

create table phieu_nhap (
so_pn int not null primary key,
ngay_nhap date
);

create table vat_tu (
ma_vt int not null primary key,
ten_vt varchar(45)
);

create table chi_tiet_px (
dg_xuat double,
sl_xuat int,
so_px int,
ma_vt int,
foreign key (so_px) references phieu_xuat (so_px),
foreign key (ma_vt) references vat_tu (ma_vt)
);

create table chi_tiet_pn (
dg_nhap double,
sl_nhap int,
so_pn int,
ma_vt int,
foreign key (so_pn) references phieu_nhap (so_pn),
foreign key (ma_vt) references vat_tu (ma_vt)
);

create table nha_cc (
ma_ncc int primary key,
ten_ncc varchar(45),
dia_chi varchar(45),
sdt varchar(45)
);

create table don_dh (
so_dh int primary key,
ngay_dh date
);

create table chi_tiet_don_dh (
so_dh int,
ma_vt int,
foreign key (so_dh) references don_dh (so_dh),
foreign key (ma_vt) references vat_tu (ma_vt)
);

create table cung_cap (
so_dh int,
ma_ncc int,
foreign key (so_dh) references don_dh (so_dh),
foreign key (ma_ncc) references nha_cc (ma_ncc)
);

create table sdt (
ma_ncc int,
sđt varchar(45),
foreign key (ma_ncc) references nha_cc (ma_ncc)
);