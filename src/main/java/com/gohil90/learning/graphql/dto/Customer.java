package com.gohil90.learning.graphql.dto;

public class Customer {
    private String cif;
    private String customerId;
    private String name;
    private Segment segment;

    public enum Segment {
        PRB, PR, PSB, STAFF
    }

    public Customer(String cif, String customerId, String name, Segment segment) {
        this.cif = cif;
        this.customerId = customerId;
        this.name = name;
        this.segment = segment;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }
}
