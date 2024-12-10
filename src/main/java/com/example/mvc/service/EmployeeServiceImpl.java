package com.example.mvc.service;

import com.example.mvc.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService{
    private static final Map<Integer, Employee> employees = new HashMap<>();
    static {
        employees.put(1, new Employee(1, "John Doe", 30, "Software Engineer", "IT", 60000.0));
        employees.put(2, new Employee(2, "Jane Smith", 28, "Project Manager", "Operations", 75000.0));
        employees.put(3, new Employee(3, "Alice Johnson", 35, "HR Manager", "Human Resources", 65000.0));
        employees.put(4, new Employee(4, "Bob Brown", 40, "Sales Executive", "Sales", 55000.0));
        employees.put(5, new Employee(5, "Charlie Davis", 25, "Marketing Specialist", "Marketing", 50000.0));
    }
    @Override
    public List<Employee> getAllEmployee() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public void add(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void update(int id, Employee employee) {
        employees.put(id, employee);
    }

    @Override
    public void delete(int id) {
        employees.remove(id);
    }
}
