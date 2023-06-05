package org.Solid.SRP;

import org.Solid.SRP.dao.AccountDaoImpl;
import org.Solid.SRP.model.Account;
import org.Solid.SRP.service.BankService;
import org.Solid.SRP.service.BankServiceImpl;
import org.Solid.SRP.service.CommissionStrategy;
import org.Solid.SRP.service.CommissionStrategyImpl;
import org.Solid.SRP.service.commission.CommissionHandler;
import org.Solid.SRP.service.commission.GoldCommissionHandler;
import org.Solid.SRP.service.commission.PlatinumCommissionHandler;
import org.Solid.SRP.service.commission.RegularCommissionHandler;
import org.Solid.SRP.service.commission.UsualCommisionHandler;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Map<Account.Type, CommissionHandler> commissionHandlerMap = new HashMap<>();
        commissionHandlerMap.put(Account.Type.GOLD, new GoldCommissionHandler());
        commissionHandlerMap.put(Account.Type.PLATINUM, new PlatinumCommissionHandler());
        commissionHandlerMap.put(Account.Type.REGULAR,new RegularCommissionHandler());
        commissionHandlerMap.put(Account.Type.USUAL, new UsualCommisionHandler());

        CommissionStrategy commissionStrategy = new CommissionStrategyImpl(commissionHandlerMap);
        BankService bankService = new BankServiceImpl(new AccountDaoImpl(), commissionStrategy);

        bankService.transfer("123","6543",new BigDecimal(1000));
    }
}
