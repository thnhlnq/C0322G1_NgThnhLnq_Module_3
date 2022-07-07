package repository.employee.impl;

import model.employee.Position;
import repository.BaseRepository;
import repository.employee.PositionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements PositionRepository {

    private static final String SELECT_POSITION = "select * from position;";

    @Override
    public List<Position> listPositions() {

        List<Position> positions = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_POSITION);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("position_id");

                String name = rs.getString("position_name");

                positions.add(new Position(id, name));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positions;
    }
}
