package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {

    List<User> findAll();

    void create(User user);

    User findById(int id);

    void delete(int id);

    void edit(User user);

    List<User> findByCountry(String findCountry);

    List<User> sortByName(String nameSort);

    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    void addUserTransaction(User user, int[] permision);

    void insertUpdateWithoutTransaction();

    void insertUpdateUseTransaction();

    List<User> displayListUser();

    void editUser(User user);

    void deleteUser(int id);
}
