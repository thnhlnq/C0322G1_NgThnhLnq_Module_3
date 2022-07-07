package repository.employee.impl;

import model.employee.Employee;
import repository.BaseRepository;
import repository.employee.EmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static final String SELECT_ALL_EMPLOYEE = "select * from employee ;";

    private static final String CREATE_EMPLOYEE = "insert into employee (employee_name, employee_date_of_birth, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ;";

    private static final String FIND_BY_ID = "select * from employee where employee_id = ? ;";

    private static final String EDIT_EMPLOYEE = "update employee set employee_name = ?, employee_date_of_birth = ?, employee_id_card = ?, employee_salary = ?, employee_phone = ?, employee_email = ?, employee_address = ?, position_id = ?, education_degree_id = ?, division_id = ? where employee_id = ? ;";

    private static final String DELETE_EMPLOYEE = "delete from employee where employee_id = ? ;";

    private static final String FIND_EMPLOYEE = "select * from employee where employee_name like ? or employee_email like ? or employee_address like ? ;";

    @Override
    public List<Employee> listEmployees() {

        List<Employee> employees = new ArrayList<>();

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_EMPLOYEE);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("employee_id");

                String name = rs.getString("employee_name");

                String dateOfBirth = rs.getString("employee_date_of_birth");

                String idCard = rs.getString("employee_id_card");

                double salary = rs.getDouble("employee_salary");

                String phone = rs.getString("employee_phone");

                String email = rs.getString("employee_email");

                String address = rs.getString("employee_address");

                int positionId = rs.getInt("position_id");

                int educationDegreeId = rs.getInt("education_degree_id");

                int divisionId = rs.getInt("division_id");

                employees.add(new Employee(id, name, dateOfBirth, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId));
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

            ps.setInt(8, employee.getPositionId());

            ps.setInt(9, employee.getEducationDegreeId());

            ps.setInt(10, employee.getDivisionId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee findById(int id) {

        Employee employee = null;

        try {

            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(FIND_BY_ID);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("employee_name");

                String dateOfBirth = rs.getString("employee_date_of_birth");

                String idCard = rs.getString("employee_id_card");

                double salary = rs.getDouble("employee_salary");

                String phone = rs.getString("employee_phone");

                String email = rs.getString("employee_email");

                String address = rs.getString("employee_address");

                int positionId = rs.getInt("position_id");

                int educationDegreeId = rs.getInt("education_degree_id");

                int divisionId = rs.getInt("division_id");

                employee = new Employee(id, name, dateOfBirth, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId);
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

            ps.setInt(8, employee.getPositionId());

            ps.setInt(9, employee.getEducationDegreeId());

            ps.setInt(10, employee.getDivisionId());

            ps.setInt(11, employee.getId());

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

    @Override
    public List<Employee> findEmployees(String nameFind) {

        List<Employee> employees = new ArrayList<>();

        try {
            Connection connection = BaseRepository.getConnection();

            PreparedStatement ps = connection.prepareStatement(FIND_EMPLOYEE);

            ps.setString(1, "%" + nameFind + "%");

            ps.setString(2, "%" + nameFind + "%");

            ps.setString(3, "%" + nameFind + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("employee_id");

                String name = rs.getString("employee_name");

                String dateOfBirth = rs.getString("employee_date_of_birth");

                String idCard = rs.getString("employee_id_card");

                double salary = rs.getDouble("employee_salary");

                String phone = rs.getString("employee_phone");

                String email = rs.getString("employee_email");

                String address = rs.getString("employee_address");

                int positionId = rs.getInt("position_id");

                int educationDegreeId = rs.getInt("education_degree_id");

                int divisionId = rs.getInt("division_id");

                employees.add(new Employee(id, name, dateOfBirth, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }
}
