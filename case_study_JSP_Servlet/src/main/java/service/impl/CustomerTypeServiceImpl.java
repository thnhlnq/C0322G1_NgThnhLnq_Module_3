package service.impl;

import model.person.CustomerType;
import repository.CustomerTypeRepository;
import repository.impl.CustomerTypeRepositoryImpl;
import service.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceImpl implements CustomerTypeService {

    static CustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    public List<CustomerType> listCustomerTypes() {
        return customerTypeRepository.listCustomerTypes();
    }
}
