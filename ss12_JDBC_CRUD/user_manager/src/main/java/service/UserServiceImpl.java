package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepositoryImpl;

import java.util.List;

public class UserServiceImpl implements IUserService {
    static IUserRepository userRepository = new UserRepositoryImpl();

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void create(User user) {
        userRepository.create(user);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public void edit(User user) {
        userRepository.edit(user);
    }

    @Override
    public List<User> findByCountry(String findCountry) {
        return userRepository.findByCountry(findCountry);
    }

    @Override
    public List<User> sortByName(String nameSort) {
        return userRepository.sortByName(nameSort);
    }
}
