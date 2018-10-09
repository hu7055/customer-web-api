package com.cgi.bootcamp.customer.service;

import com.cgi.bootcamp.customer.pojo.CustomerJson;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import com.cgi.bootcamp.lib.customer.CustomerRetriever;

import java.util.List;

@Component
@RestController
public class CustomerServiceImpl implements CustomerService {


    private CustomerRetriever custRetr = new CustomerRetriever(
            this.getClass().getClassLoader().getResource("SampleLegacyFile.dat").getPath()
    );

    @Override
    public List<CustomerJson> retrieveCustomers() {
        return null;
    }

    @Override
    public List<CustomerJson> retrieveCustomersWithSpouse() {
        return null;
    }

    @Override
    public CustomerJson retrieveCustomer(String id) {
        return null;
    }

    @Override
    public CustomerJson retrieveCustomerWithSpouse(String id) {
        return null;
    }

    //Other methods to be implemented here
}
