package service.impl;

import model.person.Customer;
import repository.CustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    static CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> listCustomers() {
        return customerRepository.listCustomers();
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.createCustomer(customer);
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
