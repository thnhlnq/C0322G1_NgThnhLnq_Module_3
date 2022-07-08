package service.customer;

import model.customer.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerService {

    List<Customer> listCustomers();

    Map<String, String> createCustomer(Customer customer);

    Customer findById(int id);

    void editCustomer(Customer customer);

    void deleteCustomer(int id);

    List<Customer> findCustomers(String nameFind);
}
