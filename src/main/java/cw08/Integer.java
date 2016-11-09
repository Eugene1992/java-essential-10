package cw08;

import cw04.junit.User;

public final class Integer {

    private final int value;
    private final Cash cash;

    public Integer(int value, Cash cash) {
        this.value = value;
        this.cash = cash;
    }

    public int getValue() {
        return value;
    }

    public Cash getCash() {
//        return cash;
        return new Cash(cash.getType());
    }

    public double parseDouble() {
        return value * 1.0;
    }
}
