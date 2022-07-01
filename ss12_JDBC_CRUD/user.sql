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

insert into users (`name`, email, country) values ('Minh','minh@codegym.vn','Viet Nam');
insert into users (`name`, email, country) values ('Kante','kante@che.uk','Kenia');

DELIMITER $$
CREATE PROCEDURE get_user_by_id (IN user_id INT)
BEGIN
    SELECT users.`name`, users.email, users.country
    FROM users
    where users.id = user_id;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE insert_user (
IN user_name varchar(50),
IN user_email varchar(50),
IN user_country varchar(50)
)
BEGIN
    INSERT INTO users (`name`, email, country) VALUES (user_name, user_email, user_country);
    END$$
DELIMITER ;

create table permision (
id int(11) primary key,
`name` varchar(50)
);

create table user_permision (
permision_id int(11),
user_id int(11)
);

insert into permision (id, `name`) values(1, 'add');
insert into permision (id, `name`) values(2, 'edit');
insert into permision (id, `name`) values(3, 'delete');
insert into permision (id, `name`) values(4, 'view');

DELIMITER $$
CREATE PROCEDURE display_list_user ()
BEGIN
    SELECT *
    FROM users;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE edit_user (id_user int, name_user varchar(45), email_user varchar(45), country_user varchar(45))
BEGIN
    set sql_safe_updates = 0;
    update users set users.`name` = name_user, users.email = email_user, users.country = country_user where users.id = id_user;
END$$
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE delete_user (id_user int)
BEGIN
    delete from users where users.id = id_user;
END$$
DELIMITER ;
