package com;

import com.context.TransferAmountContext;

public class Main {
    public static void main(String[] args) {
        TransferAmountContext transferAmountContext = new TransferAmountContext();
        int sourceAccountId = 1;
        int destinationAccountId = 2;
        int amount = 100;
        transferAmountContext.transfer(sourceAccountId, destinationAccountId, amount);
    }
}
