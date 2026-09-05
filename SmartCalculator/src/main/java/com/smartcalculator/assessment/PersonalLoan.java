package com.smartcalculator.assessment;

public class PersonalLoan extends Loan {

  public PersonalLoan(String id, String name, double principal, double rate, int tenure) {
    super(id, name, principal, rate, tenure);
  }

  @Override
  public double calculateEMI() {
    double simpleInterest = principalAmount * annualRate / 100 * tenureMonths / 12;
    return (principalAmount + simpleInterest) / tenureMonths;
  }
}
