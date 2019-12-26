package com.agharibi;

public interface Experssion {

    Experssion times(int multiplier);

    Money reduce(Bank bank, String to);

    Experssion plus(Experssion addend);
}
