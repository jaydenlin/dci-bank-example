package com.role;

import com.data.Account;
import lombok.experimental.Delegate;

public class DestinationAccount {
    @Delegate
    Account account;

    public DestinationAccount(Account account) {
        this.account = account;
    }

    public void transferFrom(SourceAccount sourceAccount, Integer amount) {
        System.out.println("got transfer from source account: " + sourceAccount + ", amount: " + amount);
        account.increase(amount);
    }
}
