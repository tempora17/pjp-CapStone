package com.smartcalculator.w5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Loan implements Auditable {

  private static final Logger LOG = LoggerFactory.getLogger(Loan.class);

  protected String loanId;
  protected String applicantName;
  protected double principal;
  protected double annualRate;

  public Loan(String loanId, String applicantName, double principal, double annualRate) {
    this.loanId = loanId;
    this.applicantName = applicantName;
    this.principal = principal;
    this.annualRate = annualRate;
  }

  public abstract double calculateEMI();

  public abstract String loanType();

  public abstract int getTenureMonths();

  @Override
  public String auditSummary(){
    return auditPrefix() + loanId + " | " + applicantName + " | Rs." + String.format("%.2f", principal) + " | Rate:" + annualRate + "%";
  }

  @Override
  public int hashCode() {
    return loanId.toLowerCase().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Loan other)) {
      return false;
    }
    return loanId.equalsIgnoreCase(other.loanId);
  }

  public void printSummary() {
    LOG.info("Loan Type: " + loanType());
    LOG.info("Loan Id: "+ loanId);
    LOG.info("Applicant: " + applicantName);
    LOG.info("Loan Amount: " + String.format("%.2f", principal));
    LOG.info("Interese Rate: " + annualRate + "%");
    LOG.info("Monthly EMI: " + String.format("%.2f", calculateEMI()));
    LOG.info("Months: " + getTenureMonths());
  }
}
