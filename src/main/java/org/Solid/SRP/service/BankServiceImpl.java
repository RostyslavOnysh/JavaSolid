package org.Solid.SRP.service;

import org.Solid.SRP.db.Storage;
import org.Solid.SRP.model.Account;
import org.Solid.dao.AccountDao;

import javax.security.auth.login.AccountNotFoundException;
import java.math.BigDecimal;

public class BankServiceImpl implements BankService {
    private AccountDao accountDao;

    public BankServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String fromAccountNumber, String toAccountNumber, BigDecimal amount) {
        // 1. Get account from storage
        // 2. Ttransfer money between accountsget(.)
        Account fromAccount = accountDao.get(fromAccountNumber);
        Account toAccount = accountDao.get(toAccountNumber);

        BigDecimal newValueFrom = fromAccount.getAmount().add(amount);
        fromAccount.setAmount(newValueFrom);

        BigDecimal newValueTo = toAccount.getAmount().add(amount);
        toAccount.setAmount(newValueTo);


        accountDao.update(fromAccount);
        accountDao.update(fromAccount);
    }
}
