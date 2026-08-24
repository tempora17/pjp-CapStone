package com.smartcalculator.w5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoanDemo {
  private static final Logger LOG = LoggerFactory.getLogger(LoanDemo.class);

  public static void main(String[] args) {
    List<Loan> loans = new ArrayList<>();

    HomeLoan homeLoan = new HomeLoan("101", "Aniket Singh", 2000000, 5, 240);
    PersonalLoan personalLoan1 = new PersonalLoan("201", "Aniket Singh 2", 3000, 12.0, 12);
    PersonalLoan personalLoan2 = new PersonalLoan("202", "Aniket Singh 3", 10000, 10.0, 6);

    loans.add(homeLoan);
    loans.add(personalLoan1);
    loans.add(personalLoan2);

    for (Loan loan : loans) {
      loan.printSummary();
    }

    Auditable audit = homeLoan;
    LOG.info(audit.auditSummary());

    Exportable export = personalLoan1;
    LOG.info(export.toCSVRow());

    HomeLoan duplicateLoan = new HomeLoan(
        "101", "Aniket Singh Duplicate", 3000000, 6.0, 180
    );

    Set<Loan> loanSet = new HashSet<>();
    loanSet.add(homeLoan);
    loanSet.add(duplicateLoan);

    LOG.info("Loans in HashSet: " + loanSet.size());
  }
}
