package com.agharibi;

public class Sum implements Experssion {

    protected final Experssion augmend;
    protected final Experssion addmend;

    public Sum(Experssion augmend, Experssion addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augmend.reduce(bank, to).amount + addmend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Experssion plus(Experssion addend) {
        return new Sum(this, addmend);
    }

    @Override
    public Experssion times(int multiplier) {
        return new Sum(augmend.times(multiplier), addmend.times(multiplier));
    }
}
