package com.smartcalculator.assessment.exceptions;

public class LoanApplicationService {

  private static final double MIN_INCOME_RATIO = 0.10;
  private static final double MAX_LOAN_AMOUNT = 5000000;
  private static final int MIN_CREDIT_SCORE = 650;

  public String applyForLoan(double income, double loanAmount, int creditScore) {
    if (loanAmount <= 0 || loanAmount > MAX_LOAN_AMOUNT) {
      throw new InvalidLoanAmountException("Invalid loan amount: " + loanAmount);
    }
    if (creditScore < MIN_CREDIT_SCORE) {
      throw new CreditScoreBelowThresholdException(
          "Credit score is below the required threshold of " + MIN_CREDIT_SCORE);
    }
    if (income < loanAmount * MIN_INCOME_RATIO) {
      double requiredIncome = loanAmount * MIN_INCOME_RATIO;
      double shortfall = requiredIncome - income;
      throw new InsufficientIncomeException(
          String.format(
              "Insufficient income. Required: %.2f, Provided: %.2f", requiredIncome, income),
          shortfall);
    }

    return "APPROVED";
  }

  public static void main(String[] args) {
    LoanApplicationService service = new LoanApplicationService();
    System.out.println("SCENARIO 1: ALL PASS");
    try {
      String result = service.applyForLoan(100000, 500000, 700);
      System.out.println("Result: " + result);
    } catch (LoanException e) {
      System.out.println("Loan failed: " + e.getMessage());
    } finally {
      System.out.println("Application processing completed.");
    }

    System.out.println("SCENARIO 2: INCOME TOO LOW");
    try {
      service.applyForLoan(30000, 500000, 700);
    } catch (InsufficientIncomeException e) {
      System.out.println("Error: " + e.getMessage());
      System.out.printf("Shortfall: %.2f%n", e.getShortfall());
    } finally {
      System.out.println("Application processing completed.");
    }

    System.out.println("SCENARIO 3: INVALID AMOUNT");
    try {
      service.applyForLoan(100000, 6000000, 700);
    } catch (InvalidLoanAmountException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Application processing completed.");
    }

    System.out.println("SCENARIO 4: CREDIT SCORE TOO LOW");
    try {
      service.applyForLoan(100000, 500000, 600);
    } catch (CreditScoreBelowThresholdException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Application processing completed.");
    }
  }
}
