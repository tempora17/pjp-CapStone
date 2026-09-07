package com.smartcalculator;

public class BugFixer {

//  This is the original Buggy code
  static double findLargest(double[] amounts) {
    double max = 0;                         // Bug 1
    for (int i = 0; i <= amounts.length; i++) {  // Bug 2
      if (amounts[i] > max) max = amounts[i];
    }
    return max;
  }

//  This is the fixed code
  static double fixedfindLargest(double[] amounts) {
//    Fix for Bug 1: max cannot start at 0 because all values could be negative.
    double max = Double.NEGATIVE_INFINITY;

//    Fix for Bug 2: array indexes go from 0 to length - 1, so use < instead of <=.
    for (int i = 0; i < amounts.length; i++) {
      if (amounts[i] > max) max = amounts[i];
    }
    return max;
  }

  public static void main(String[] args) {
    double[] arr = {-1, -2, -3};
    System.out.println(fixedfindLargest(arr));
  }
}
