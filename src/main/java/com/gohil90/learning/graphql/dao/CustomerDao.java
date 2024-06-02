package com.gohil90.learning.graphql.dao;

import com.gohil90.learning.graphql.dto.Customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerDao {

    private static final List<Customer> CUSTOMERS =
            Arrays.asList(new Customer("12345678", "CUE-ajsbhdauysbd",
                            "Nayan", Customer.Segment.PSB, Arrays.asList("ACE-1", "ACE-2")),
                    new Customer("87654321", "CUE-sieuryw47e",
                            " Nilesh", Customer.Segment.STAFF, Arrays.asList("ACE-3", "ACE-4")));

    public List<Customer> getCustomers(int count, int offset) {
        return CUSTOMERS.subList(offset, offset + count);
    }

    public Customer getCustomer(String cif) {
        return CUSTOMERS.stream().filter(customer -> customer.getCif().equalsIgnoreCase(cif))
                .findAny().orElse(null);
    }
}
