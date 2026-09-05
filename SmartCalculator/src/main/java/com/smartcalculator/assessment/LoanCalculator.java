package com.smartcalculator.assessment;

public class LoanCalculator {

  public boolean assessEligibility(double monthlyIncome) {
    boolean eligible = monthlyIncome > 25_000;
    System.out.println("Income-only eligibility: " + (eligible ? "ELIGIBLE" : "NOT ELIGIBLE"));
    return eligible;
  }

  public boolean assessEligibility(double monthlyIncome, double existingEMI) {
    boolean eligible = (monthlyIncome - existingEMI) > 20000;
    System.out.println("Income and EMI eligibility: " + (eligible ? "ELIGIBLE" : "NOT ELIGIBLE"));
    return eligible;
  }

  public boolean assessEligibility(double monthlyIncome, double existingEMI, int creditScore) {
    boolean eligible = (monthlyIncome - existingEMI) > 20000 && creditScore > 650;
    System.out.println(
        "Income, EMI and credit score eligibility: " + (eligible ? "ELIGIBLE" : "NOT ELIGIBLE"));
    return eligible;
  }
}
