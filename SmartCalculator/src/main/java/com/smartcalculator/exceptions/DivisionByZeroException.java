package com.smartcalculator.exceptions;

/**
 * Exception thrown when a division by zero is attempted.
 */
public class DivisionByZeroException extends ArithmeticException {

  /**
   * Creates a division-by-zero exception.
   */
  public DivisionByZeroException() {
    super("Cannot divide by zero");
  }

}
