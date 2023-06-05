package org.Solid.SRP.service;

import org.Solid.SRP.model.Account;
import org.Solid.SRP.dao.AccountDao;

import java.math.BigDecimal;

public class BankServiceImpl implements BankService {
    private AccountDao accountDao;


    @Override
    public void transfer(String fromAccountNumber, String toAccountNumber, BigDecimal amount) {
        // 1. Get account from storage
        // 2. Ttransfer money between accountsget(.)
        Account fromAccount = accountDao.get(fromAccountNumber);
        Account toAccount = accountDao.get(toAccountNumber);


        //TODO :  calculate commission based on account type
        // if Account.TYPE.REGULAR --> commission is 1%
        // if Account.TYPE.GOLD --> commission is 3 UAH
        // if Account.TYPE.PLATINUM --> commission is 0 UAH
        // if Account.TYPE.USUAL --> commission is 10 UAH
BigDecimal commission = new BigDecimal(0);
        if (fromAccount.getType() == Account.Type.REGULAR) {
commission = amount.multiply(new BigDecimal("0.01"));
        }else if (fromAccount.getType() == Account.Type.GOLD) {
            commission = new BigDecimal(3);
        }

        BigDecimal newValueFrom = fromAccount.getAmount().subtract(amount).subtract(commission);
        fromAccount.setAmount(newValueFrom);

        BigDecimal newValueTo = toAccount.getAmount().subtract(amount);
        toAccount.setAmount(newValueTo);


        accountDao.update(fromAccount);
        accountDao.update(fromAccount);
    }
}
