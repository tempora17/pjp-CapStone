package com.smartcalculator.Week4;

public final class BankConfig {

    private BankConfig() {
//        This will prevent the instance creation of this class
//        And "final" ensure that no class inherit it
    }

    public static final double MAX_DEPOSIT = 500_000.0;
    public static final double MAX_WITHDRAWAL = 200_000.0;
    public static final int MAX_DAILY_TXN = 10;
}
