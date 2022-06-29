package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Aspire", 1000, "Good", "Acer"));
        products.add(new Product(2, "Thinkpad", 1200, "Excellent", "Lenovo"));
        products.add(new Product(3, "Macbook", 1500, "Good", "Apple"));
        products.add(new Product(4, "Nitro Tiger", 1400, "Excellent", "Acer"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void create(int id, Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id - 1);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> searchList = new ArrayList<>();
        for (Product item : products) {
            if (item.getName().contains(name)) {
                searchList.add(item);
            }
        }
        return searchList;
    }

    @Override
    public void edit(int id, Product product) {
        products.set(id - 1, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id - 1);
    }
}
