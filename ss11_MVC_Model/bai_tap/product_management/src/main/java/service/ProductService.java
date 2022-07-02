package service;

import model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void create(Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    void edit(Product product);

    void delete(int id);
}
