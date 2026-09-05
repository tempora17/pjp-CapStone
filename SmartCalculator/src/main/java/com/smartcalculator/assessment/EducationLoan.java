package com.smartcalculator.assessment;

public class EducationLoan extends Loan {

  private static final int MORATORIUM_MONTHS = 6;

  public EducationLoan(String id, String name, double principal, double rate, int tenure) {
    super(id, name, principal, rate, tenure);
  }

  @Override
  public double calculateEMI() {
    double simpleInterest = principalAmount * annualRate / 100 * tenureMonths / 12;
    return (principalAmount + simpleInterest) / tenureMonths;
  }

  @Override
  public double totalRepayable() {
    double normalRepayment = calculateEMI() * tenureMonths;
    double moratoriumInterest = principalAmount * annualRate / 100 * MORATORIUM_MONTHS / 12;
    return normalRepayment + moratoriumInterest;
  }
}
