package com.smartcalculator.assessment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoanDemo {

  public static void main(String[] args) {
    System.out.println("TASK A1: RUNTIME POLYMORPHISM");

    List<Loan> loans = new ArrayList<>();
    loans.add(new HomeLoan("H101", "Aniket Singh", 1000000, 10, 200));
    loans.add(new PersonalLoan("P102", "Aniket Singh 2", 100000, 10, 60));
    loans.add(new EducationLoan("E103", "Aniket Singh 3", 100000, 10, 120));

    for (Loan loan : loans) {
      loan.printSummary();
      System.out.println();
    }

    System.out.println("TASK A2: METHOD OVERLOADING");

    LoanCalculator calculator = new LoanCalculator();

    calculator.assessEligibility(30000);
    calculator.assessEligibility(40000, 25000);
    calculator.assessEligibility(50000, 25000, 700);

    System.out.println("TASK B1: INTERFACES");
    Auditable a = new HomeLoan("H201", "Aniket Singh", 100000, 10, 180);
    Exportable e = new HomeLoan("H202", "Meet Singh", 100000, 10, 180);

    System.out.println(a.getAuditLog());
    System.out.println(e.toCSVRow());

    System.out.println("TASK B2: EQUALS AND HASHCODE");

    Loan loan1 = new HomeLoan("H300", "Aniket Singh", 1000000, 10, 240);
    Loan loan2 = new HomeLoan("h300", "Different Applicant", 1000000, 10, 120);

    Set<Loan> loanSet = new HashSet<>();

    loanSet.add(loan1);
    loanSet.add(loan2);

    System.out.println("HashSet size: " + loanSet.size());
    // Both objects have the same loan ID ignoring case,
    // so equals() returns true and hashCode() is also the same.
    // Therefore HashSet keeps only one object.
  }
}
