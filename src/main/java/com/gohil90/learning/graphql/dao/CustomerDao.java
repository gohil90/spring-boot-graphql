package com.gohil90.learning.graphql.dao;

import com.gohil90.learning.graphql.dto.Customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerDao {
    public List<Customer> getCustomers(int count, int offset) {
        return Arrays.asList(new Customer("12345678", "CUE-ajsbhdauysbd",
                        "Nayan", Customer.Segment.PSB),
                new Customer("87654321", "CUE-sieuryw47e",
                        " Nilesh", Customer.Segment.STAFF));
    }
}
