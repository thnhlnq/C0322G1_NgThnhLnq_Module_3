package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Aspire", 1000, "good", "Acer"));
        products.put(2, new Product(2, "Thinkphp", 1200, "excellent", "Lenovo"));
        products.put(3, new Product(3, "Macbook", 1500, "good", "Apple"));
        products.put(4, new Product(4, "Nitro Tiger", 1400, "excellent", "Acer"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }

    @Override
    public void edit(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
