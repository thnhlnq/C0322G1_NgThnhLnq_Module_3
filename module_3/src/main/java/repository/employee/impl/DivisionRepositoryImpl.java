package repository.employee.impl;

import model.employee.Division;
import repository.BaseRepository;
import repository.employee.DivisionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepositoryImpl implements DivisionRepository {

    private static final String SELECT_DIVISION = "select * from division;";

    @Override
    public List<Division> listDivisions() {

        List<Division> divisions = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_DIVISION);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("division_id");

                String name = rs.getString("division_name");

                divisions.add(new Division(id, name));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return divisions;
    }
}
