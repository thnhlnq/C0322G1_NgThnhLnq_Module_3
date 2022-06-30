package service;

import model.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    void create(User user);

    User findById(int id);

    void delete(int id);

    void edit(User user);

    List<User> findByCountry(String findCountry);

    List<User> sortByName(String nameSort);
}
