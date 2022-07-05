package repository;

import model.person.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> listEmployees();

    void createEmployee(Employee employee);

    Employee findById(int id);

    void editEmployee(Employee employee);

    void deleteEmployee(int id);
}
