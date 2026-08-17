package com.smartcalculator.biweekly;

public class StringBuilderDemo {
    public static String buildReport(String[] items) {
        StringBuilder report = new StringBuilder("Report: ");

        for (int i = 0; i < items.length; i++) {
            if (i > 0) {
                report.append(" | ");
            }
            report.append(items[i]);
        }

        return report.toString();
    }

    public static void main(String[] args) {

        String[] transactions = {
                "Salary",
                "Saving",
                "Payment",
                "Electricity Bill",
                "UPI Payment"
        };
        System.out.println(buildReport(transactions));
    }
//     StringBuilder is preferred over String concatenation in a loop
//     because String objects are immutable. Repeated concatenation
//     creates many new String objects, while StringBuilder modifies
//     the same object and is more efficient.
}
