package repository.employee.impl;

import model.user.User;
import repository.BaseRepository;
import repository.employee.UsernameRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsernameRepositoryImpl implements UsernameRepository {

    private static final String SELECT_USERNAME = "select * from user ;";

    @Override
    public List<User> listUsers() {

        List<User> users = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_USERNAME);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String username = rs.getString("username");

                String password = rs.getString("password");

                users.add(new User(username, password));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}
