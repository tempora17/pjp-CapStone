package com.smartcalculator.biweekly;

public class AccountFormatter {
    public static String formatAccountSummary(String name, double balance, String accountType){
        String formattedName = name.toUpperCase();
        String formattedBalance = String.format("%.2f", balance);

        return "'Account Holder: " + formattedName + " | Type: " +
                accountType + " | " +
                "Balance: ₹" + formattedBalance;
    }

    public static void main(String[] args) {
        System.out.println(
                formatAccountSummary("Aniket Singh", 45200.51340, "SAVINGS")
        );
        System.out.println(
                formatAccountSummary("XYZ", 12500, "CURRENT")
        );

        System.out.println(
                formatAccountSummary("xyz", 999.9, "SAVINGS")
        );
    }
}
