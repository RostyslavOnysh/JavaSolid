package org.Solid.SRP.service.commission;

import java.math.BigDecimal;

public class UsualCommisionHandler  implements  CommissionHandler{
    @Override
    public BigDecimal getCommission(BigDecimal amount) {
        return new BigDecimal(10);
    }
}
