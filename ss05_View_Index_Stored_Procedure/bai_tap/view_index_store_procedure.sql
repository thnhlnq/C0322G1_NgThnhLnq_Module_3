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
VALUES ('code1', 'aspire', 1000, 10, 'qwerty', 'mnbvc'),
       ('code2', 'macbook', 1500, 20, 'poiuy', 'klaacns'),
       ('code3', 'thinkpad', 1300, 15, 'alksn', 'kklankns');
       
CREATE UNIQUE INDEX unique_index ON products (product_code);

CREATE INDEX composite_index ON products (product_name, product_price);

EXPLAIN SELECT * FROM products;

CREATE VIEW product_list AS
    SELECT 
        products.product_code,
        products.product_name,
        products.product_price,
        products.product_status
    FROM products;
