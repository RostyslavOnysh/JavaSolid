package org.Solid.SRP;

import org.Solid.SRP.service.BankService;
import org.Solid.SRP.service.BankServiceImpl;
import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();
        bankService.transfer("123","5678", BigDecimal.valueOf(10));
    }
}
