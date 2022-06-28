package servlet;

import model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
        float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);
        try {
            float result = Calculator.calculate(firstOperand, secondOperand, operator);
            request.setAttribute("result", firstOperand + " " + operator + " " + secondOperand + " = " + result);
        } catch (Exception ex) {
            request.setAttribute("result", "Error: " + ex.getMessage());
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
