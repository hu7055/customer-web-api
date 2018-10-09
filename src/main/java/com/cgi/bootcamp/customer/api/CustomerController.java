package com.cgi.bootcamp.customer.api;

import com.cgi.bootcamp.customer.pojo.CustomerJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cgi.bootcamp.customer.service.*;

import java.io.IOException;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value="/api/v1/customers", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CustomerJson>> getCustomer() throws IOException {

        return new ResponseEntity<List<CustomerJson>>(
                customerService.retrieveCustomers(),
                HttpStatus.OK
        );
    }
}
