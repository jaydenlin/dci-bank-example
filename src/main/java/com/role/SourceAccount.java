package com.role;

import com.data.Account;
import lombok.experimental.Delegate;

public class SourceAccount {
    @Delegate
    Account account;

    public SourceAccount(Account account) {
        this.account = account;
    }

    public void transferTo(DestinationAccount destinationAccount, Integer amount) {
        if (account.balance() < amount) {
            System.out.println("ERROR. Insufficient funds, Operation aborted. ");
        } else {
            System.out.println("transfer to destination account: " + destinationAccount + ", amount: " + amount);
            account.decrease(amount);
            destinationAccount.transferFrom(this, amount);
        }
    }
}
