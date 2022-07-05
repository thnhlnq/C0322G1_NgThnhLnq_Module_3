package service.impl;

import model.person.Employee;
import repository.EmployeeRepository;
import repository.impl.EmployeeRepositoryImpl;
import service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    static EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> listEmployees() {
        return employeeRepository.listEmployees();
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.createEmployee(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeRepository.editEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployee(id);
    }
}
