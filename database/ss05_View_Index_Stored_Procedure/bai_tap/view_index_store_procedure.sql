DROP DATABASE IF EXISTS demo;

CREATE DATABASE demo;

USE demo;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_code VARCHAR(45),
    product_name VARCHAR(45),
    product_price DOUBLE,
    product_amount DOUBLE,
    product_description VARCHAR(100),
    product_status VARCHAR(45)
);

INSERT INTO products (product_code, product_name, product_price, product_amount, product_description, product_status)
VALUES ('code1', 'aspire',   1000, 10, 'qwerty', 'mnbvc'),
       ('code2', 'macbook',  1500, 20, 'poiuy',  'klaacns'),
       ('code3', 'thinkpad', 1300, 15, 'alksn',  'kklankns');

-- tạo unique index --       
CREATE UNIQUE INDEX unique_index ON products (product_code);

-- tạo composite index --
CREATE INDEX composite_index ON products (product_name, product_price);

-- sử dụng explain --
EXPLAIN SELECT * FROM products;

-- tạo view --
CREATE VIEW product_list AS
    SELECT 
        products.product_code,
        products.product_name,
        products.product_price,
        products.product_status
    FROM products;
    
SELECT * from product_list;

-- cập nhật view --
SET sql_safe_updates = 0;
UPDATE product_list SET product_status = 'ultraego' WHERE product_status = 'mnbvc';

-- xoá view --
DROP VIEW product_status;

-- hiển thị product --
delimiter //
CREATE PROCEDURE all_info ()
BEGIN 
SELECT * FROM products;
END;
// delimiter ;

call all_info ();

-- thêm product --
delimiter //
CREATE PROCEDURE add_info (product_code VARCHAR(45), product_name VARCHAR(45), product_price double, product_amount double, product_description varchar(100), product_status VARCHAR(45))
BEGIN 
INSERT INTO products (product_code, product_name, product_price, product_amount, product_description, product_status)
VALUES (product_code, product_name, product_price, product_amount, product_description, product_status);
END;
// delimiter ;

call add_info ('code5', 'aspire', 1800, 30, 'qwerty', 'pokhui');

-- cập nhật product --
delimiter // 
CREATE PROCEDURE update_info (update_product VARCHAR(45))
BEGIN 
UPDATE products set product_status = 'good' WHERE product_status = 'pokhui';
END;
// delimiter ;

call update_info ('mnbhgi');

-- xoá product --
delimiter //
CREATE PROCEDURE delete_info (delete_product VARCHAR(45))
BEGIN 
DELETE FROM products WHERE product_status = 'good';
END;
// delimiter ;

call delete_info ('zxcvb');