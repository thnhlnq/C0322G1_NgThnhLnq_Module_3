package controller;

import model.employee.Division;
import model.employee.EducationDegree;
import model.employee.Employee;
import model.employee.Position;
import model.user.User;
import service.employee.*;
import service.employee.impl.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employees")

public class EmployeeServlet extends HttpServlet {

    static EmployeeService employeeService = new EmployeeServiceImpl();

    static PositionService positionService = new PositionServiceImpl();

    static EducationDegreeService educationDegreeService = new EducationDegreeServiceImpl();

    static DivisionService divisionService = new DivisionServiceImpl();

    static UsernameService usernameService = new UsernameServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {

            case "create":
                showCreateForm(request, response);
                break;


            case "edit":
                showEditForm(request, response);
                break;

            case "Search":
                showFindForm(request, response);
                break;

            default:
                listEmployee(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }

        switch (action) {

            case "create":
                createEmployee(request, response);
                break;

            case "edit":
                editEmployee(request, response);
                break;

            case "delete":
                deleteEmployee(request, response);
                break;

            default:
                listEmployee(request, response);
                break;
        }
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Employee> employees = employeeService.listEmployees();
        request.setAttribute("employees", employees);

        List<Position> positions = positionService.listPositions();
        request.setAttribute("positions", positions);

        List<EducationDegree> educationDegrees = educationDegreeService.listEducationDegrees();
        request.setAttribute("educationDegrees", educationDegrees);

        List<Division> divisions = divisionService.listDivisions();
        request.setAttribute("divisions", divisions);

        List<User> users = usernameService.listUsers();
        request.setAttribute("users", users);

        request.getRequestDispatcher("view/employee/list.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Position> positions = positionService.listPositions();
        request.setAttribute("positions", positions);

        List<EducationDegree> educationDegrees = educationDegreeService.listEducationDegrees();
        request.setAttribute("educationDegrees", educationDegrees);

        List<Division> divisions = divisionService.listDivisions();
        request.setAttribute("divisions", divisions);

        List<User> users = usernameService.listUsers();
        request.setAttribute("users", users);

        request.getRequestDispatcher("view/employee/create.jsp").forward(request, response);
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Employee> employees = employeeService.listEmployees();

        String name = request.getParameter("name");

        String dateOfBirth = request.getParameter("dateOfBirth");

        String idCard = request.getParameter("idCard");

        double salary = Double.parseDouble(request.getParameter("salary"));

        String phone = request.getParameter("phone");

        String email = request.getParameter("email");

        String address = request.getParameter("address");

        int positionId = Integer.parseInt(request.getParameter("positionId"));

        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));

        int divisionId = Integer.parseInt(request.getParameter("divisionId"));

        int max = 0;

        for (Employee item : employees) {
            if (max < item.getId()) {
                max = item.getId();
            }
        }
        int id = max + 1;

        Employee employee = new Employee(id, name, dateOfBirth, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId);

        employeeService.createEmployee(employee);

        request.getRequestDispatcher("view/employee/create.jsp").forward(request, response);

    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Employee employee = employeeService.findById(id);
        request.setAttribute("employee", employee);

        List<Position> positions = positionService.listPositions();
        request.setAttribute("positions", positions);

        List<EducationDegree> educationDegrees = educationDegreeService.listEducationDegrees();
        request.setAttribute("educationDegrees", educationDegrees);

        List<Division> divisions = divisionService.listDivisions();
        request.setAttribute("divisions", divisions);

        List<User> users = usernameService.listUsers();
        request.setAttribute("users", users);

        request.getRequestDispatcher("view/employee/edit.jsp").forward(request, response);
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        String name = request.getParameter("name");

        String dateOfBirth = request.getParameter("dateOfBirth");

        String idCard = request.getParameter("idCard");

        double salary = Double.parseDouble(request.getParameter("salary"));

        String phone = request.getParameter("phone");

        String email = request.getParameter("email");

        String address = request.getParameter("address");

        int positionId = Integer.parseInt(request.getParameter("positionId"));

        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));

        int divisionId = Integer.parseInt(request.getParameter("divisionId"));

        Employee employee = new Employee(id, name, dateOfBirth, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId);

        employeeService.editEmployee(employee);

        request.getRequestDispatcher("view/employee/edit.jsp").forward(request, response);
    }

    private void showFindForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nameFind = request.getParameter("nameFind");

        List<Employee> employees = employeeService.findEmployees(nameFind);

        request.setAttribute("employees", employees);

        request.getRequestDispatcher("view/employee/list.jsp").forward(request, response);
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("idDelete"));

        employeeService.deleteEmployee(id);

        List<Employee> employees = employeeService.listEmployees();
        request.setAttribute("employees", employees);

        List<Position> positions = positionService.listPositions();
        request.setAttribute("positions", positions);

        List<EducationDegree> educationDegrees = educationDegreeService.listEducationDegrees();
        request.setAttribute("educationDegrees", educationDegrees);

        List<Division> divisions = divisionService.listDivisions();
        request.setAttribute("divisions", divisions);

        List<User> users = usernameService.listUsers();
        request.setAttribute("users", users);

        request.getRequestDispatcher("view/employee/list.jsp").forward(request, response);
    }
}