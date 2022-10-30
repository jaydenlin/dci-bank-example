package com.repository;

import com.data.Account;

import java.util.HashMap;

public class AccountRepo {
    HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

    public AccountRepo() {
        accounts.put(1, new Account(1000));
        accounts.put(2, new Account(200));
    }

    public Account findById(Integer accountId) {
        return accounts.get(accountId);
    }
}
