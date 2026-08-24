package com.smartcalculator.w5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class LoanDemo {
  private static final Logger LOG = LoggerFactory.getLogger(LoanDemo.class);

  public static void main(String[] args) {
    List<Loan> loans = new ArrayList<>();

    loans.add(new HomeLoan("101", "Aniket Singh", 2000000, 5, 240));
    loans.add(new PersonalLoan("201", "Aniket Singh 2", 3000, 12.0, 12));
    loans.add(new PersonalLoan("201", "Aniket Singh 3", 10000, 10.0, 6));

    for (Loan loan : loans) {
      LOG.info("Loan Type: " + loan.loanType());
      loan.printSummary();
    }
  }
}
