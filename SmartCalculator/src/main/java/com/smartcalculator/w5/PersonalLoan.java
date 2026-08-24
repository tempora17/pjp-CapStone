package com.smartcalculator.w5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonalLoan extends Loan implements Exportable{
  private static final Logger LOG = LoggerFactory.getLogger(PersonalLoan.class);

  public int getTenureMonths() {
    return tenureMonths;
  }

  private int tenureMonths;

  public PersonalLoan(String loanId, String applicantName, double principal, double annualRate, int tenureMonths) {
    super(loanId, applicantName, principal, annualRate);
    this.tenureMonths = tenureMonths;
  }

  @Override
  public double calculateEMI() {
    double totalAmount = principal + (principal * annualRate / 100 * tenureMonths / 12.0);

    return totalAmount / tenureMonths;
  }

  @Override
  public String loanType() {
    return "Personal Loan";
  }

  @Override
  public String toCSVRow() {
    return loanId + "," + applicantName + "," + principal + "," + annualRate + "," + tenureMonths + "," + calculateEMI();
  }
}
