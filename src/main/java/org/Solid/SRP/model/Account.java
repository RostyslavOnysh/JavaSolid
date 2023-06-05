package org.Solid.SRP.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String number;
    private BigDecimal amount = new BigDecimal(0);
    private Type type;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }


    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                '}';
    }

    public enum Type {
        REGULAR,GOLD,PLATINUM,USUAL;
    }
}
