package service;

import model.customer.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> listCustomers();

    void createCustomer(Customer customer);

    Customer findById(int id);

    void editCustomer(Customer customer);

    void deleteCustomer(int id);

    List<Customer> findCustomers(String nameFind);
}
