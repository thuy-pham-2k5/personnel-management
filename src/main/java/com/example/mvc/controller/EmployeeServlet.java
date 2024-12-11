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
                add(req, resp);
                break;
            case "edit":
                edit(req, resp);
                break;
            default:
                break;
        }
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));
        Employee employee = this.employeeService.getEmployeeById(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setPosition(position);
        employee.setDepartment(department);
        employee.setSalary(salary);
        employeeService.update(id, employee);

        resp.sendRedirect("/employees");
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = (int) (Math.random() * 1000);
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee employee = new Employee(id, name, age, position, department, salary);
        this.employeeService.add(employee);

        req.setAttribute("employee", employee);
        resp.sendRedirect("/employees");
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
            case "edit":
                showEditEmployee (req, resp);
            default:
                showAllEmployee(req, resp);
                break;
        }
    }

    private void showEditEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Employee employee = this.employeeService.getEmployeeById(id);
        req.setAttribute("employee", employee);
        RequestDispatcher dispatcher = req.getRequestDispatcher("employee/edit.jsp");
        dispatcher.forward(req, resp);
    }

    private void showAddEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("employee/view.jsp");
        dispatcher.forward(req, resp);
    }

    private void showAllEmployee(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = this.employeeService.getAllEmployee();
        req.setAttribute("employees", employees);
        RequestDispatcher dispatcher = req.getRequestDispatcher("employee/home.jsp");
        dispatcher.forward(req, resp);
    }
}
