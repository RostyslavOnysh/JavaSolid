package org.Solid.SRP.service;

import org.Solid.SRP.model.Account;
import org.Solid.SRP.service.commission.CommissionHandler;

public interface CommissionStrategy {
    CommissionHandler get(Account.Type type);
}
