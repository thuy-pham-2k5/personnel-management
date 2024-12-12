package com.example.mvc.service;

import com.example.mvc.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static final Map<Integer, Customer> customers = new HashMap<>();

    static {
        customers.put(1, new Customer(1, "Nguyen Viet Tam", "0971702991", "nguyenviettam@gmail.com", "Van Quan, Lap Thach, Vinh Phuc", "D:/z6122163786676_82143f21db7bf177ca766d8711bfdc60.jpg"));
        customers.put(2, new Customer(2, "Le Van Dan", "0281439357", "levandan@gmail.com", "Hung Vuong, Tan Tien, Bac Giang", "https://th.bing.com/th/id/OIP.ZEH8eq4a1Pd_AGD0EUTklwHaE8?w=274&h=183&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customers.put(3, new Customer(3, "Nguyen Thi Phuong Anh", "0369721795", "meowmeowpa@gmail.com", "Thanh pho Quan Quang", "https://th.bing.com/th/id/OIP.LsSx6kxsbQWlMRJ8S15lkQHaE8?w=285&h=190&c=7&r=0&o=5&dpr=1.3&pid=1.7"));
        customers.put(4, new Customer(4, "Pham Thi Kim Thuy", "0397464805", "phamthikimthuy@gmail.com", "Thuy Noi, Yen Luong, Y Yen, Nam Dinh", "D:/z6122163558481_eaa2717e4d0b852cfdd591e7038f4e4a.jpg"));
    }

    @Override
    public List<Customer> getAllCustomer() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(int id) {
        return customers.get(id);
    }

    @Override
    public void add(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }
}
