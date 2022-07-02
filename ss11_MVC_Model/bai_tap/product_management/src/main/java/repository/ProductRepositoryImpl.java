package repository;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private static final String INSERT_PRODUCT = "insert into products (name, price, description, producer) values (?, ?, ?, ?);";
    private static final String FIND_ALL_PRODUCT = "select * from products;";
    private static final String FIND_BY_ID = "select * from products where id = ?;";
    private static final String FIND_BY_NAME = "select * from products where name like ?;";
    private static final String EDIT_PRODUCT = "update products set name = ?, price = ?, description = ?, producer = ? where id = ?;";
    private static final String DELETE_PRODUCT = "delete from products where id = ?;";

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(FIND_ALL_PRODUCT);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String description = rs.getString("description");
                String producer = rs.getString("producer");
                products.add(new Product(id, name, price, description, producer));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    @Override
    public void create(int id, Product product) {
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(INSERT_PRODUCT);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getDescription());
            ps.setString(4, product.getProducer());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Product findById(int id) {
        List<Product> products = new ArrayList<>();
        Product product = null;
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String description = rs.getString("description");
                String producer = rs.getString("producer");
                products.add(new Product(id, name, price, description, producer));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> findByName(String findName) {
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(FIND_BY_NAME);
            ps.setString(1, "%" + findName + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String description = rs.getString("description");
                String producer = rs.getString("producer");
                products.add(new Product(id, name, price, description, producer));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    @Override
    public void edit(Product product) {
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(EDIT_PRODUCT);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setString(3, product.getDescription());
            ps.setString(4, product.getProducer());
            ps.setInt(5, product.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(DELETE_PRODUCT);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
