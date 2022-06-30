drop database if exists demo_users;

CREATE DATABASE demo_users;

USE demo_users;

create table users (
    id int(3) AUTO_INCREMENT,
    `name` varchar(120) NOT NULL,
    email varchar(220) NOT NULL,
    country varchar(120),
    PRIMARY KEY (id)
);

insert into users(`name`, email, country) values ('Minh','minh@codegym.vn','Viet Nam');
insert into users(`name`, email, country) values ('Kante','kante@che.uk','Kenia');
