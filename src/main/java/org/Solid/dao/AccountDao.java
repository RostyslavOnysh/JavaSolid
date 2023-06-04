package org.Solid.dao;

import org.Solid.SRP.model.Account;

public interface AccountDao {
     void add (Account account);
     Account get (String accountNumber);

    void update(Account account);
}
