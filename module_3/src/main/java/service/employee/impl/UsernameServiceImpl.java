package service.employee.impl;

import repository.employee.UsernameRepository;
import repository.employee.impl.UsernameRepositoryImpl;
import service.employee.UsernameService;

public class UsernameServiceImpl implements UsernameService {

    static UsernameRepository usernameRepository = new UsernameRepositoryImpl();

//    @Override
//    public List<User> listUsers() {
//        return usernameRepository.listUsers();
//    }
}
