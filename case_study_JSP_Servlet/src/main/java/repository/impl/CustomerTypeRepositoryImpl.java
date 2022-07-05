package repository.impl;

import model.person.CustomerType;
import repository.CustomerTypeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {

    private static final String SELECT_CUSTOMER_TYPE = "select * from customer_type ;";

    @Override
    public List<CustomerType> listCustomerTypes() {

        List<CustomerType> customerTypes = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_CUSTOMER_TYPE);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("customer_type_id");

                String name = rs.getString("customer_type_name");

                customerTypes.add(new CustomerType(id, name));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypes;
    }
}
