package service.customer.impl;

import common.Validate;
import model.customer.Customer;
import repository.customer.CustomerRepository;
import repository.customer.impl.CustomerRepositoryImpl;
import service.customer.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    static CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> listCustomers() {
        return customerRepository.listCustomers();
    }

    @Override
    public Map<String, String> createCustomer(Customer customer) {

        Map<String, String> map = new HashMap();

        if (!customer.getName().matches(Validate.REGEX_NAME)) {
            map.put("name", "Name Incorrect Format: First Letter Must Be Capitalized, Doesn't Contain Number !!");
        }

        if (!customer.getPhone().matches(Validate.REGEX_PHONE)) {
            map.put("phone", "Phone Incorrect Format: 090xxxxxxx / 091xxxxxxx / (84)+90xxxxxxx / (84)+91xxxxxxx !!");
        }

        if (!customer.getIdCard().matches(Validate.REGEX_ID_CARD)) {
            map.put("idCard", "Id Card Incorrect Format: XXXXXXXXX / XXXXXXXXXXXX (X is 0-9).");
        }

        if (!customer.getEmail().matches(Validate.REGEX_EMAIL)) {
            map.put("email", "Email Must Be Correct Format.");
        }

        if (map.isEmpty()) {
            customerRepository.createCustomer(customer);
        }

        return map;
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void editCustomer(Customer customer) {
        customerRepository.editCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public List<Customer> findCustomers(String nameFind) {
        return customerRepository.findCustomers(nameFind);
    }
}
