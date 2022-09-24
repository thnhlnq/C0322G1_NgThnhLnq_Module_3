package repository.impl;

import model.ThanhVien;
import repository.BaseRepository;
import repository.ThanhVienRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThanhVienRepositoryImpl implements ThanhVienRepository {

    private static final String SELECT_THANH_VIEN = "select * from thanh_vien ;";

    @Override
    public List<ThanhVien> listThanhVien() {

        List<ThanhVien> thanhViens = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_THANH_VIEN);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int cmnd = rs.getInt("cmnd");

                String hoTen = rs.getString("ho_ten");

                String ngaySinh = rs.getString("ngay_sinh");

                String maHoKhau = rs.getString("ma_ho_khau");

                thanhViens.add(new ThanhVien(cmnd, hoTen, ngaySinh, maHoKhau));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return thanhViens;
    }
}
