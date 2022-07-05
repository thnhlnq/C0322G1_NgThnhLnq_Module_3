package repository.impl;

import model.person.Employee;
import repository.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final String SELECT_ALL_EMPLOYEE = "select * from employee;";
    private static final String CREATE_EMPLOYEE = "insert into employee (name, dateOfBirth, idCard, salary, phone, email, address) values (?, ?, ?, ?, ?, ?, ?);";
    private static final String FIND_BY_ID = "select * from employee where id = ?;";
    private static final String EDIT_EMPLOYEE = "update employee set name = ?, dateOfBirth = ?, idCard = ?, salary = ?, phone = ?, email = ?, address = ? where id = ?;";
    private static final String DELETE_EMPLOYEE = "delete employee where id = ?;";

    @Override
    public List<Employee> listEmployees() {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("dateOfBirth");
                String idCard = rs.getString("idCard");
                double salary = rs.getDouble("salary");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                employees.add(new Employee(id, name, dateOfBirth, idCard, salary, phone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public void createEmployee(Employee employee) {
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(CREATE_EMPLOYEE);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDateOfBirth());
            ps.setString(3, employee.getIdCard());
            ps.setDouble(4, employee.getSalary());
            ps.setString(5, employee.getPhone());
            ps.setString(6, employee.getEmail());
            ps.setString(7, employee.getAddress());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee findById(int id) {
        List<Employee> employees = new ArrayList<>();
        Employee employee = null;
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String dateOfBirth = rs.getString("dateOfBirth");
                String idCard = rs.getString("idCard");
                double salary = rs.getDouble("salary");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String address = rs.getString("address");
                employees.add(new Employee(id, name, dateOfBirth, idCard, salary, phone, email, address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public void editEmployee(Employee employee) {
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(EDIT_EMPLOYEE);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getDateOfBirth());
            ps.setString(3, employee.getIdCard());
            ps.setDouble(4, employee.getSalary());
            ps.setString(5, employee.getPhone());
            ps.setString(6, employee.getEmail());
            ps.setString(7, employee.getAddress());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        try {
            Connection connection = BaseRepository.getConnection();
            PreparedStatement ps = connection.prepareStatement(DELETE_EMPLOYEE);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
