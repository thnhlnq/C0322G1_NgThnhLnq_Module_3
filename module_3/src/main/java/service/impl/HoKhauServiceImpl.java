package service.impl;

import model.HoKhau;
import repository.HoKhauRepository;
import repository.impl.HoKhauRepositoryImpl;
import service.HoKhauService;

import java.util.List;

public class HoKhauServiceImpl implements HoKhauService {

    static HoKhauRepository hoKhauRepository = new HoKhauRepositoryImpl();

    @Override
    public List<HoKhau> listHoKhau() {
        return hoKhauRepository.listHoKhau();
    }

    @Override
    public void createHoKhau(HoKhau hoKhau) {
        hoKhauRepository.createHoKhau(hoKhau);
    }

    @Override
    public HoKhau findByMaHoKhau(String maHoKhau) {
        return hoKhauRepository.findByMaHoKhau(maHoKhau);
    }

    @Override
    public void editHoKhau(HoKhau hoKhau) {
        hoKhauRepository.editHoKhau(hoKhau);
    }

    @Override
    public void deleteHoKhau(int id) {
        hoKhauRepository.deleteHoKhau(id);
    }

    @Override
    public List<HoKhau> findHoKhau(String nameFind) {
        return hoKhauRepository.findHoKhau(nameFind);
    }
}
