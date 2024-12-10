package com.example.mvc.service;

import com.example.mvc.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById (int id);
    public void addEmployee (int id);
    public void updateEmployee (Employee employee);
    public void deleteEmPloyee (Employee employee);
    public List<Employee> searchEmployeeWithName (String name);
}
