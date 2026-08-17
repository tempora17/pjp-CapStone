package com.smartcalculator.biweekly;

public class TransactionClassifier {
    public static String classifyTransaction(String type, double amount) {
        return switch (type) {
            case "CREDIT" -> "Income — positive cash flow";
            case "DEBIT" -> "Expense — deducted from balance";
            case "TRANSFER" -> {
                if (amount > 10000) {
                    yield "Large Transfer — requires OTP";
                } else {
                    yield "Standard Transfer";
                }
            }
            case "WITHDRAWAL" -> "Cash Withdrawal";
            default -> throw new IllegalArgumentException(
                    "Unknown case: " + type
            );
        };
    }
    public static void main(String[] args) {

        System.out.println(classifyTransaction("CREDIT", 5000));
        System.out.println(classifyTransaction("DEBIT", 1500));
        System.out.println(classifyTransaction("TRANSFER", 5000));
        System.out.println(classifyTransaction("TRANSFER", 15000));
        System.out.println(classifyTransaction("WITHDRAWAL", 2000));

        try {
            System.out.println(classifyTransaction("PAYMENT", 1000));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
