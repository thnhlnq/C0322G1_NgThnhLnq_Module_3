package service.employee.impl;

import model.employee.Division;
import repository.employee.DivisionRepository;
import repository.employee.impl.DivisionRepositoryImpl;
import service.employee.DivisionService;

import java.util.List;

public class DivisionServiceImpl implements DivisionService {

    static DivisionRepository divisionRepository = new DivisionRepositoryImpl();

    @Override
    public List<Division> listDivisions() {
        return divisionRepository.listDivisions();
    }
}
