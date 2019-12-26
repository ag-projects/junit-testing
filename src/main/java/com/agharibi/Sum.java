package com.agharibi;

public class Sum implements Experssion {

    protected Money augmend;
    protected Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);
    }
}
