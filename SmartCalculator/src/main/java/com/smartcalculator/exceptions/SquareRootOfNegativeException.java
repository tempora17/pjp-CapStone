package com.smartcalculator.exceptions;

/** Exception thrown when square root of a negative number is attempted. */
public class SquareRootOfNegativeException extends ArithmeticException {

  /** Creates a square-root-of-negative-number exception. */
  public SquareRootOfNegativeException() {
    super("Cannot take square root of a negative number");
  }
}
