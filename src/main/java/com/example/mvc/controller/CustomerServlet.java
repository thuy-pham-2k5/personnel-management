package com.example.mvc.controller;

import com.example.mvc.model.Customer;
import com.example.mvc.service.CustomerService;
import com.example.mvc.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet (value = "/customer")
public class CustomerServlet extends HttpServlet {
    private final CustomerService customerService = new CustomerServiceImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null) {
            action = "";
        }
        switch (action) {
            case "add":
                add (request, response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:
                break;
        }
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = (int) (Math.random() * 100);
        String imageUrl = request.getParameter("imageUrl");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        Customer customer = new Customer(id, name, phone, email, address, imageUrl);
        customerService.add(customer);
        request.setAttribute("customers", customer);
        response.sendRedirect("/customer");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null) {
            action = "";
        }
        switch (action) {
            case "add":
                showAddCustomer (request, response);
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:
                showAllCustomer (request, response);
                break;
        }
    }

    private void showAddCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/add.jsp");
        dispatcher.forward(request, response);
    }

    private void showAllCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = customerService.getAllCustomer();
        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/customer/home.jsp");
        dispatcher.forward(request, response);
    }
}
