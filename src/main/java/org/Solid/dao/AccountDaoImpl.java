package org.Solid.dao;

import org.Solid.SRP.db.Storage;
import org.Solid.SRP.model.Account;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void update(Account account) {
        // 1. find account
        //2.  remove account
        //3. add new account

        Account accountFromDb = get(account.getNumber());
        Storage.accounts.remove(accountFromDb);

        add(account);
    }

    @Override
    public void add(Account account) {
        Storage.accounts.add(account);
    }

    @Override
    public Account get(String accountNumber) {
        return Storage.accounts.stream()
                .filter(a -> a.getNumber().equals(accountNumber))
                .findFirst().get();
    }
}
