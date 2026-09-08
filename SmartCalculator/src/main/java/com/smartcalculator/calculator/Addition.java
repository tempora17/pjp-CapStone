package com.smartcalculator.calculator;

import java.math.BigDecimal;

/** Represents an addition operation. */
public class Addition extends Operation implements Calculable {

  /**
   * Creates an addition operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Addition(BigDecimal firstNumber, BigDecimal secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the sum of the two numbers.
   *
   * @return the sum of the two numbers
   */
  @Override
  public double calculate() {
    return getSecondNumber().add(getFirstNumber()).doubleValue();
  }

  /**
   * Returns a readable representation of the addition.
   *
   * @return a string describing the addition
   */
  @Override
  public String toString() {
    return "Addition: "
        + getFirstNumber()
        + " + "
        + getSecondNumber()
        + " = "
        + String.format("%.2f", calculate());
  }
}
