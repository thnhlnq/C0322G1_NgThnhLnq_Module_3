package service;

import model.HoKhau;

import java.util.List;

public interface HoKhauService {

    List<HoKhau> listHoKhau();

    void createHoKhau(HoKhau hoKhau);

    HoKhau findByMaHoKhau(String maHoKhau);

    void editHoKhau(HoKhau hoKhau);

    void deleteHoKhau(int id);

    List<HoKhau> findHoKhau(String nameFind);
}
