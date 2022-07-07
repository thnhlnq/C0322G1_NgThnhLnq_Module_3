package repository.employee.impl;

import model.employee.User;
import repository.employee.UsernameRepository;

import java.util.List;

public class UsernameRepositoryImpl implements UsernameRepository {

//    private static final String SELECT_USERNAME = "select * from user ;";

//    @Override
//    public List<User> listUsers() {

//        List<User> users = new ArrayList<>();
//
//        try {
//            Connection connection = BaseRepository.getConnection();
//
//            PreparedStatement ps = connection.prepareStatement(SELECT_USERNAME);
//
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                String username = rs.getString("username");
//
//                String password = rs.getString("password");
//
//                users.add(new User(username, password));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return users;
//    }
}
