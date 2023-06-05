package org.Solid.SRP.service;

import org.Solid.SRP.dao.AccountDaoImpl;
import org.Solid.SRP.model.Account;
import org.Solid.SRP.dao.AccountDao;

import java.math.BigDecimal;

public class BankServiceImpl implements BankService {
    private AccountDao accountDao;

    public BankServiceImpl(AccountDaoImpl accountDao, CommissionStrategy commissionStrategy) {
        this.commissionStrategy = commissionStrategy;
    }

    private CommissionStrategy commissionStrategy;


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



        BigDecimal commission = commissionStrategy.get(fromAccount.getType()).getCommission(amount);

        BigDecimal newValueFrom = fromAccount.getAmount().subtract(amount).subtract(commission);
        fromAccount.setAmount(newValueFrom);

        BigDecimal newValueTo = toAccount.getAmount().subtract(amount);
        toAccount.setAmount(newValueTo);


        accountDao.update(fromAccount);
        accountDao.update(fromAccount);
    }
}
