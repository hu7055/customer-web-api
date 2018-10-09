package com.cgi.bootcamp.customer.pojo;

import com.cgi.bootcamp.lib.interfaces.customerinfo.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerJson {

    private Customer customer;

    public CustomerJson(Customer c) {
        customer = c;
    }

    @JsonProperty("id")
    public String getId() {
        return customer.customerId;
    }

}
