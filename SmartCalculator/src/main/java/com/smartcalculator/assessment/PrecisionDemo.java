package com.smartcalculator.assessment;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrecisionDemo {

  public static void main(String[] args) {
    System.out.println("FLOATING-POINT PRECISION PROBLEM");
    double d1 = 0.1 + 0.2;
    System.out.println("double result: " + d1);

    System.out.println("\nBIGDECIMAL SOLUTION");
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    System.out.println("BigDecimal result: " + bd1.add(bd2));

    System.out.println("\nCOMPOUND INTEREST");
    BigDecimal principal = new BigDecimal("500000");
    BigDecimal annualRate = new BigDecimal("0.085");
    int years = 3;
    int compoundsPerYear = 12;
    int totalPeriods = years * compoundsPerYear;

    BigDecimal periodicRate = annualRate.divide(BigDecimal.valueOf(compoundsPerYear), 20, RoundingMode.HALF_UP);
    BigDecimal factor = BigDecimal.ONE.add(periodicRate).pow(totalPeriods);
    BigDecimal amount = principal.multiply(factor).setScale(2, RoundingMode.HALF_UP);

    System.out.println("Principal: ₹" + principal);
    System.out.println("Annual Rate: 8.5%");
    System.out.println("Time: 3 years");
    System.out.println("Compounded: Monthly");
    System.out.println("Final Amount: ₹" + amount);

    BigDecimal interest = amount.subtract(principal);
    System.out.println("Compound Interest: ₹" + interest);
  }
}