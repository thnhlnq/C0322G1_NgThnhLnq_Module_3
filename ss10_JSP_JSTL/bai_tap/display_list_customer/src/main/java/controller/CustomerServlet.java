package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {

    static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer("Mai Van Hoan", "1983-08-20", "Ha Noi","https://cdn-icons-png.flaticon.com/512/3011/3011270.png"));
        customers.add(new Customer("Nguyen Van Nam", "1983-08-21", "Bac Giang", "https://cdn-icons-png.flaticon.com/512/236/236832.png"));
        customers.add(new Customer("Nguyen Thai Hoa", "1983-08-22", "Nam Dinh", "https://cdn-icons-png.flaticon.com/512/3135/3135715.png"));
        customers.add(new Customer("Tran Dang Khoa", "1983-08-17", "Ho Tay", "https://cdn-icons-png.flaticon.com/512/236/236831.png"));
        customers.add(new Customer("Nguyen Dinh Thi", "1983-08-19", "Ha Noi", "https://cdn-icons-png.flaticon.com/512/4128/4128176.png"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("customerList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
