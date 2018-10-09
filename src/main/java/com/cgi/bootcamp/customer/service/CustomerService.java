package com.cgi.bootcamp.customer.service;

import com.cgi.bootcamp.customer.pojo.CustomerJson;

import java.util.List;

public interface CustomerService {

    public List<CustomerJson> retrieveCustomers();
    public List<CustomerJson> retrieveCustomersWithSpouse();
    public CustomerJson retrieveCustomer(String id);
    public CustomerJson retrieveCustomerWithSpouse(String id);
    //Other definitions to be added here
}
