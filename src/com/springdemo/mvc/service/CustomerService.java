package com.springdemo.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springdemo.mvc.entity.Customer;

@Service
public interface CustomerService {

    public List<Customer> getCustomers(int theSortField);

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

    public List<Customer> searchCustomer(String theSearchName);
}
