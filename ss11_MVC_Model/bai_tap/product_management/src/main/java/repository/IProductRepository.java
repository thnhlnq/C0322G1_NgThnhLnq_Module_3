package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    void create(int id, Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    void edit(int id, Product product);

    void delete(int id);
}
