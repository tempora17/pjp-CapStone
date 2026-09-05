package com.smartcalculator.assessment;

import java.util.*;

public class LoanPortfolio {

  public static void main(String[] args) {
    List<Loan> loans = new ArrayList<>();
    loans.add(new HomeLoan("H101", "Aniket Singh", 1000000, 10, 200));
    loans.add(new PersonalLoan("P102", "Aniket Singh", 100000, 10, 60));
    loans.add(new EducationLoan("E103", "Aniket Singh 3", 100000, 10, 120));

    System.out.println("LIST USING FOR-EACH");
    for (Loan loan : loans) {
      System.out.println(loan.getLoanId() + " - " + loan.getApplicantName());
    }
    System.out.println("\nLIST USING ITERATOR");
    Iterator<Loan> iterator = loans.iterator();
    while (iterator.hasNext()) {
      Loan loan = iterator.next();
      System.out.println(loan.getLoanId() + " - " + loan.getApplicantName());
    }

    System.out.println("\nMAP LOOKUP");
    Map<String, Loan> loanMap = new HashMap<>();

    for (Loan loan : loans) {
      loanMap.put(loan.getLoanId(), loan);
    }
    Loan foundLoan = loanMap.get("H101");
    if (foundLoan != null) {
      System.out.println("Found: " + foundLoan.getApplicantName());
    }

    Loan missingLoan = loanMap.get("H999");
    if (missingLoan == null) {
      System.out.println("Loan HL999 not found.");
    }

    System.out.println("\nUNIQUE APPLICANTS");
    Set<String> applicants = new HashSet<>();

    for (Loan loan : loans) {
      applicants.add(loan.getApplicantName());
    }

    System.out.println("Unique applicant count: " + applicants.size());
  }
}
