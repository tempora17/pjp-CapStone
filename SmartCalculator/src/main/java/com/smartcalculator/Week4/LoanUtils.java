package com.smartcalculator.Week4;

/*
 * Five clean-code violations in the original method:
 *
 * 1. Meaningless method name: "calc" does not describe the operation.
 * 2. Meaningless parameter names: "a", "b", and "c" do not explain their purpose.
 * 3. Magic numbers: "1200" and "1" are unexplained numeric values.
 * 4. Poor formatting/readability: the loop and calculation are compressed into one line.
 * 5. Unclear variable name: "r" does not describe the value being stored.
 */

public class LoanUtils {

    private static final double MONTHS_PER_YEAR = 12.0;
    private static final double PERCENTAGE_CONVERSION = 100.0;

    /**
     * Calculates the loan amount after applying monthly interest for the given years.
     *
     * @param principal the initial loan amount
     * @param annualInterestRate the annual interest rate in percent
     * @param years the loan duration in years
     * @return the loan amount after applying compound monthly interest
     */
    public static double calculateLoanAmount(double principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / (MONTHS_PER_YEAR * PERCENTAGE_CONVERSION);

        int totalMonths = years * (int) MONTHS_PER_YEAR;
        double compoundFactor = 1.0;
        for (int month = 0; month < totalMonths; month++) {
            compoundFactor *= (1 + monthlyInterestRate);
        }

        return principal * compoundFactor;
    }
}

