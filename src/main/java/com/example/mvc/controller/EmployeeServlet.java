package com.example.mvc.controller;

import com.example.mvc.model.Employee;
import com.example.mvc.service.EmployeeService;
import com.example.mvc.service.EmployeeServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", value = "/employees")
public class EmployeeServlet extends HttpServlet {
    private final EmployeeService employeeService = new EmployeeServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "add":
                addNewEmployee(req, resp);
                break;
            case "create":
                break;
            default:
                break;
        }
    }

    private void addNewEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        int id = (int) (Math.random() * 1000);
//        String name = req.getParameter("name");
//        int age = Integer.parseInt(req.getParameter("age"));
//        String position = req.getParameter("position");
//        String department = req.getParameter("department");
//        double salary = Double.parseDouble(req.getParameter("salary"));
//
//        Employee employee = new Employee(id, name, age, position, department, salary);
//        this.employeeService.add(employee);
//
//        RequestDispatcher dispatcher = req.getRequestDispatcher("employee/view.jsp");
//        req.setAttribute("employee", employee);
//        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
            case "add":
                showAddEmployee(req, resp);
                break;
            default:
                showAllEmployee(req, resp);
                break;
        }
    }

    private void showAddEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/employee/view.jsp");
        dispatcher.forward(req, resp);
    }

    private void showAllEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = this.employeeService.getAllEmployee();
        System.out.println(employees);
        req.setAttribute("employees", employees);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/employee/home.jsp");
        dispatcher.forward(req, resp);
    }
}
