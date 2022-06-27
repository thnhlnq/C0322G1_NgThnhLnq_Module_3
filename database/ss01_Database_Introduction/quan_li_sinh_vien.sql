CREATE DATABASE quan_ly_sinh_vien;

USE quan_ly_sinh_vien;

CREATE TABLE class(
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE teacher(
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(50),
    age int,
    count VARCHAR(20)
);
