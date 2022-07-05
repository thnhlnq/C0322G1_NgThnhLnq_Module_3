package repository.impl;

import model.person.Customer;
import repository.CustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static final String SELECT_ALL_CUSTOMER = "select * from customer ;";
    private static final String INSERT_CUSTOMER = "insert into customer (customer_name, customer_date_of_birth, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id) values (?, ?, ?, ?, ?, ?, ?, ?) ;";
    private static final String FIND_BY_ID = "select * from customer where customer_id = ? ;";
    private static final String EDIT_CUSTOMER = "update customer set customer_name = ?, customer_date_of_birth = ?, customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ?, customer_type_id = ? where customer_id  = ? ;";
    private static final String DELETE_CUSTOMER = "delete from customer where customer_id = ? ;";
    private static final String FIND_CUSTOMER = "select * from customer where customer_name like ? or customer_email like ? or customer_address like ? or customer_type_id like ?;";

    @Override
    public List<Customer> listCustomers() {

        List<Customer> customers = new ArrayList<>();

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_CUSTOMER);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("customer_id");

                String name = rs.getString("customer_name");

                String dateOfBirth = rs.getString("customer_date_of_birth");

                int gender = rs.getInt("customer_gender");

                String idCard = rs.getString("customer_id_card");

                String phone = rs.getString("customer_phone");

                String email = rs.getString("customer_email");

                String address = rs.getString("customer_address");

                int customerTypeId = rs.getInt("customer_type_id");

                customers.add(new Customer(id, name, dateOfBirth, gender, idCard, phone, email, address, customerTypeId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public void createCustomer(Customer customer) {

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(INSERT_CUSTOMER);

            ps.setString(1, customer.getName());

            ps.setString(2, customer.getDateOfBirth());

            ps.setInt(3, customer.getGender());

            ps.setString(4, customer.getIdCard());

            ps.setString(5, customer.getPhone());

            ps.setString(6, customer.getEmail());

            ps.setString(7, customer.getAddress());

            ps.setInt(8, customer.getCustomerTypeId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {

        Customer customer = null;

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(FIND_BY_ID);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("customer_name");

                String dateOfBirth = rs.getString("customer_date_of_birth");

                int gender = rs.getInt("customer_gender");

                String idCard = rs.getString("customer_id_card");

                String phone = rs.getString("customer_phone");

                String email = rs.getString("customer_email");

                String address = rs.getString("customer_address");

                int customerTypeId = rs.getInt("customer_type_id");

                customer = new Customer(id, name, dateOfBirth, gender, idCard, phone, email, address, customerTypeId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

    @Override
    public void editCustomer(Customer customer) {

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(EDIT_CUSTOMER);

            ps.setString(1, customer.getName());

            ps.setString(2, customer.getDateOfBirth());

            ps.setInt(3, customer.getGender());

            ps.setString(4, customer.getIdCard());

            ps.setString(5, customer.getPhone());

            ps.setString(6, customer.getEmail());

            ps.setString(7, customer.getAddress());

            ps.setInt(8, customer.getCustomerTypeId());

            ps.setInt(9, customer.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(int id) {

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(DELETE_CUSTOMER);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findCustomers(String nameFind) {

        List<Customer> customers = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(FIND_CUSTOMER);

            ps.setString(1, "%" + nameFind + "%");
            ps.setString(2, "%" + nameFind + "%");
            ps.setString(3, "%" + nameFind + "%");
            ps.setString(4, "%" + nameFind + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("customer_id");

                String name = rs.getString("customer_name");

                String dateOfBirth = rs.getString("customer_date_of_birth");

                int gender = rs.getInt("customer_gender");

                String idCard = rs.getString("customer_id_card");

                String phone = rs.getString("customer_phone");

                String email = rs.getString("customer_email");

                String address = rs.getString("customer_address");

                int customerTypeId = rs.getInt("customer_type_id");

                customers.add(new Customer(id, name, dateOfBirth, gender, idCard, phone, email, address, customerTypeId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
