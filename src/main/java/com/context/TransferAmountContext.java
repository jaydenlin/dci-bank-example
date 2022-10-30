package com.context;

import com.repository.AccountRepo;
import com.role.DestinationAccount;
import com.role.SourceAccount;

public class TransferAmountContext {
    AccountRepo accountRepo = new AccountRepo();

    //a.k.a use case
    public void transfer (Integer sourceAccountId, Integer destinationAccountId, Integer amount) {
        //decorate the dumb data with a 'role'
        SourceAccount sourceAccount = new SourceAccount(accountRepo.findById(1));
        //decorate the dumb data with a 'role'
        DestinationAccount destinationAccount = new DestinationAccount(accountRepo.findById(2));
        //play the role
        sourceAccount.transferTo(destinationAccount, amount);
        Integer balance = destinationAccount.balance();
        System.out.println("destination balance is " + balance);
    }
}
