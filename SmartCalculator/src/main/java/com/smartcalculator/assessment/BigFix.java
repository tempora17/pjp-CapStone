package com.smartcalculator.assessment;

public class BigFix {
  // Original buggy method
  public static int sumEvensBuggy(int n) {
    int sum = 1;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        sum += i;
      }
    }
    return sum;
  }
  // Fixed method
  public static int sumEvens(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = 10;
    System.out.println("Buggy output: " + sumEvensBuggy(n));
    System.out.println("Fixed output: " + sumEvens(n));
  }
}
