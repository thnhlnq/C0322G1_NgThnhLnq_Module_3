package repository.impl;

import model.HoKhau;
import repository.BaseRepository;
import repository.HoKhauRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HoKhauRepositoryImpl implements HoKhauRepository {

    private static final String SELECT_ALL_HO_KHAU = "select * from ho_khau ;";

    private static final String INSERT_HO_KHAU = "insert into ho_khau (ma_ho_khau, ten_chu_ho, so_thanh_vien, ngay_lap_ho_khau, dia_chi) values (?, ?, ?, ?, ?) ;";

    private static final String FIND_BY_MA_HK = "select * from ho_khau where ma_ho_khau = ? ;";

    private static final String EDIT_HO_KHAU = "update ho_khau set ten_chu_ho = ?, so_thanh_vien = ?, ngay_lap_ho_khau = ?, dia_chi = ? where ma_ho_khau  = ? ;";

    private static final String DELETE_HO_KHAU = "delete from ho_khau where ma_ho_khau = ? ;";

    private static final String FIND_HO_KHAU = "select * from ho_khau where ten_chu like ? or customer_email like ? or customer_address like ? or customer_type_id like ?;";

    @Override
    public List<HoKhau> listHoKhau() {

        List<HoKhau> hoKhaus = new ArrayList<>();

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_HO_KHAU);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String maHoKhau = rs.getString("ma_ho_khau");

                String tenChuHo = rs.getString("ten_chu_ho");

                int soThanhVien = rs.getInt("so_thanh_vien");

                String ngayLapHoKhau = rs.getString("ngay_lap_ho_khau");

                String diaChi = rs.getString("dia_chi");

                hoKhaus.add(new HoKhau(maHoKhau, tenChuHo, soThanhVien, ngayLapHoKhau, diaChi));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hoKhaus;
    }

    @Override
    public void createHoKhau(HoKhau hoKhau) {

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(INSERT_HO_KHAU);

            ps.setString(1, hoKhau.getMaHoKhau());

            ps.setString(2, hoKhau.getTenChuHo());

            ps.setInt(3, hoKhau.getSoThanhVien());

            ps.setString(4, hoKhau.getNgayLapHoKhau());

            ps.setString(5, hoKhau.getDiaChi());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public HoKhau findByMaHoKhau(String maHoKhau) {

        HoKhau hoKhau = null;

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(FIND_BY_MA_HK);

            ps.setString(1, maHoKhau);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String tenChuHo = rs.getString("ten_chu_ho");

                int soThanhVien = rs.getInt("so_thanh_vien");

                String ngayLapHoKhau = rs.getString("ngay_lap_ho_khau");

                String diaChi = rs.getString("dia_chi");

                hoKhau = new HoKhau(maHoKhau, tenChuHo, soThanhVien, ngayLapHoKhau, diaChi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hoKhau;
    }

    @Override
    public void editHoKhau(HoKhau hoKhau) {

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(EDIT_HO_KHAU);

            ps.setString(1, hoKhau.getTenChuHo());

            ps.setInt(2, hoKhau.getSoThanhVien());

            ps.setString(3, hoKhau.getNgayLapHoKhau());

            ps.setString(4, hoKhau.getDiaChi());

            ps.setString(5, hoKhau.getMaHoKhau());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteHoKhau(int id) {

//        try {
//
//            Connection connection = BaseRepository.getConnection();
//
//            PreparedStatement ps = connection.prepareStatement(DELETE_CUSTOMER);
//
//            ps.setInt(1, id);
//
//            ps.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public List<HoKhau> findHoKhau(String nameFind) {

        List<HoKhau> customers = new ArrayList<>();
//
//        try {
//            Connection connection = BaseRepository.getConnection();
//
//            PreparedStatement ps = connection.prepareStatement(FIND_CUSTOMER);
//
//            ps.setString(1, "%" + nameFind + "%");
//
//            ps.setString(2, "%" + nameFind + "%");
//
//            ps.setString(3, "%" + nameFind + "%");
//
//            ps.setString(4, "%" + nameFind + "%");
//
//            ResultSet rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                int id = rs.getInt("customer_id");
//
//                String name = rs.getString("customer_name");
//
//                String dateOfBirth = rs.getString("customer_date_of_birth");
//
//                int gender = rs.getInt("customer_gender");
//
//                String idCard = rs.getString("customer_id_card");
//
//                String phone = rs.getString("customer_phone");
//
//                String email = rs.getString("customer_email");
//
//                String address = rs.getString("customer_address");
//
//                int customerTypeId = rs.getInt("customer_type_id");
//
//                customers.add(new HoKhau(id, name, dateOfBirth, gender, idCard, phone, email, address, customerTypeId));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return customers;
    }
}
