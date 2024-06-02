package com.gohil90.learning.graphql.controller;

import com.gohil90.learning.graphql.dao.CustomerDao;
import com.gohil90.learning.graphql.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @QueryMapping
    public List<Customer> getCustomers(@Argument int count, @Argument int offset) {
        return this.customerDao.getCustomers(count, offset);
    }
}
