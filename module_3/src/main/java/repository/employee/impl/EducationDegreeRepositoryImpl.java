package repository.employee.impl;

import model.employee.EducationDegree;
import repository.BaseRepository;
import repository.employee.EducationDegreeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDegreeRepositoryImpl implements EducationDegreeRepository {

    private static final String SELECT_EDUCATION_DEGREE = "select * from education_degree;";

    @Override
    public List<EducationDegree> listEducationDegrees() {

        List<EducationDegree> listEducationDegrees = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_EDUCATION_DEGREE);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id  = rs.getInt("education_degree_id");

                String name = rs.getString("education_degree_name");

                listEducationDegrees.add(new EducationDegree(id, name));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listEducationDegrees;
    }
}
