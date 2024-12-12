package com.example.mvc.service;

import com.example.mvc.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    Customer getCustomerById(int id);

    void add(Customer customer);

    void update(int id, Customer customer);

    void delete(int id);
}
