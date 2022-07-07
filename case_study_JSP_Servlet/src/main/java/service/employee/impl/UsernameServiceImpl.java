package service.employee.impl;

import model.user.User;
import repository.employee.UsernameRepository;
import repository.employee.impl.UsernameRepositoryImpl;
import service.employee.UsernameService;

import java.util.List;

public class UsernameServiceImpl implements UsernameService {

    static UsernameRepository usernameRepository = new UsernameRepositoryImpl();

    @Override
    public List<User> listUsers() {
        return usernameRepository.listUsers();
    }
}
