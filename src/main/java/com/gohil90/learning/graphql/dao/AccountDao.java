package com.gohil90.learning.graphql.dao;

import com.gohil90.learning.graphql.dto.Account;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class AccountDao {

    private static final List<Account> ACCOUNTS =
            Arrays.asList(new Account("ACE-1", "23872384723", Account.AccountType.CURRENT, "12345678"),
                    new Account("ACE-2", "65468489498", Account.AccountType.SAVINGS, "12345678"),
                    new Account("ACE-3", "98411891891", Account.AccountType.INVESTMENT, "87654321"),
                    new Account("ACE-4", "65489820926", Account.AccountType.SAVINGS, "87654321"));

    public List<Account> getCustomerAccounts(String cif) {
        return ACCOUNTS.stream().filter(account -> account.getCif().equalsIgnoreCase(cif)).toList();
    }
}
