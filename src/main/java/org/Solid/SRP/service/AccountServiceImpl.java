package org.Solid.SRP.service;

import org.Solid.SRP.model.Account;
import org.Solid.dao.AccountDao;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void createNewAccount(String accountNumber) {
        Account account = new Account();
        account.setNumber(accountNumber);
        accountDao.add(account);
    }
}
