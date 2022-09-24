package repository;

import model.HoKhau;

import java.util.List;

public interface HoKhauRepository {

    List<HoKhau> listHoKhau();

    void createHoKhau(HoKhau hoKhau);

    HoKhau findByMaHoKhau(String maHoKhau);

    void editHoKhau(HoKhau hoKhau);

    void deleteHoKhau(int id);

    List<HoKhau> findHoKhau(String nameFind);
}
