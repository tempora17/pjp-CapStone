package com.smartcalculator.w5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeLoan extends Loan{
  private static final Logger LOG = LoggerFactory.getLogger(HomeLoan.class);

  public int getTenureMonths() {
    return tenureMonths;
  }

  private int tenureMonths;

  public HomeLoan(String loanId, String applicantName, double principal, double annualRate, int tenureMonths) {
    super(loanId, applicantName, principal, annualRate);
    this.tenureMonths = tenureMonths;
  }

  @Override
  public double calculateEMI() {
    double r = annualRate / 12 / 100;
    double power = Math.pow(1 + r, this.tenureMonths);

    return principal * r * power / (power - 1);
  }


  @Override
  public String loanType() {
    return "Home Loan";
  }

}
