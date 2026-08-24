package com.smartcalculator.w5;

import java.util.List;

public class CodeSmell {

  /*
    1. Poor Naming
    The original code uses `l` as the name of the loan list.
    This name is not descriptive. A better name will be `loans`.

    2. Magic Numbers
    The values `500000` and `2000000` are used directly in the condition.
    It is not clear what these numbers represent.

    3. Unnecessary Index-Based Loop
    The method uses an index to access every loan from the list.
    Since we only need each Loan object, an enhanced for loop is simpler and easier
    to read.
  */
  final double MIN_PRINCIPAL = 500000;
  final double MAX_PRINCIPAL = 2000000;

  void process(List<Loan> loans) {
    for (Loan loan : loans) {
      if (loan.principal > MIN_PRINCIPAL && loan.principal < MAX_PRINCIPAL) {
        System.out.println(loan.loanId);
      }
    }
  }
}
