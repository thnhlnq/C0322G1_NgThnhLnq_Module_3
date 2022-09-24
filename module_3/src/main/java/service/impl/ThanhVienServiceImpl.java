package service.impl;

import model.ThanhVien;
import repository.ThanhVienRepository;
import repository.impl.ThanhVienRepositoryImpl;
import service.ThanhVienService;

import java.util.List;

public class ThanhVienServiceImpl implements ThanhVienService {

    static ThanhVienRepository thanhVienRepository = new ThanhVienRepositoryImpl();

    @Override
    public List<ThanhVien> listThanhVien() {
        return thanhVienRepository.listThanhVien();
    }
}
