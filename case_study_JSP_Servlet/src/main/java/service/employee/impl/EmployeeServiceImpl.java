package service.employee.impl;

import model.employee.Employee;
import repository.employee.EmployeeRepository;
import repository.employee.impl.EmployeeRepositoryImpl;
import service.employee.EmployeeService;

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

    @Override
    public List<Employee> findEmployees(String nameFind) {
        return employeeRepository.findEmployees(nameFind);
    }
}
