package com.example.mvc.service;

import com.example.mvc.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(int id);

    public void add(Employee employee);

    public void update(int id, Employee employee);

    public void delete(int id);
}
