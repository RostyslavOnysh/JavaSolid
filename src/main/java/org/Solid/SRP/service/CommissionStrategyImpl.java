package org.Solid.SRP.service;

import org.Solid.SRP.model.Account;
import org.Solid.SRP.service.commission.CommissionHandler;

import java.util.Map;

public class CommissionStrategyImpl implements CommissionStrategy {
    public CommissionStrategyImpl(Map<Account.Type, CommissionHandler> commissionHandlerMap) {
        this.commissionHandlerMap = commissionHandlerMap;
    }

    private Map<Account.Type, CommissionHandler> commissionHandlerMap;

    @Override
    public CommissionHandler get(Account.Type type) {
        return commissionHandlerMap.get(type);
    }
}
