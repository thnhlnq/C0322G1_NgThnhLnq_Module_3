package repository.employee;

import model.user.User;

import java.util.List;

public interface UsernameRepository {

    List<User> listUsers();
}
