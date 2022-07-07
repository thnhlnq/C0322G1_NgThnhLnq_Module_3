package service.employee.impl;

import model.employee.EducationDegree;
import repository.employee.EducationDegreeRepository;
import repository.employee.impl.EducationDegreeRepositoryImpl;
import service.employee.EducationDegreeService;

import java.util.List;

public class EducationDegreeServiceImpl implements EducationDegreeService {

    static EducationDegreeRepository educationDegreeRepository = new EducationDegreeRepositoryImpl();

    @Override
    public List<EducationDegree> listEducationDegrees() {
        return educationDegreeRepository.listEducationDegrees();
    }
}
