package com.gohil90.learning.graphql.dto;

public class Account {
    private String id;
    private String number;
    private AccountType type;
    private String cif;

    public enum AccountType {
        SAVINGS, CURRENT, INVESTMENT
    }

    public Account(String id, String number, AccountType type, String cif) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.cif = cif;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
