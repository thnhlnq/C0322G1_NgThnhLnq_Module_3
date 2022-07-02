package repository;

import model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> findAll();

    void create(int id, Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    void edit(Product product);

    void delete(int id);
}
