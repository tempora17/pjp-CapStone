package com.smartcalculator.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Division extends Operation implements Calculable {
  public static final Logger LOG = LoggerFactory.getLogger(Division.class);

  /**
   * Creates a division operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Division(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the division between two numbers.
   *
   * @return the division between two numbers. Double.NaN if division by zero.
   */
  @Override
  public double calculate() {
    if (getSecondNumber() == 0) {
      LOG.warn("Cannot divide by zero");
      return Double.NaN;
    }
    return getFirstNumber() / getSecondNumber();
  }

  /**
   * Returns a readable representation of the division.
   *
   * @return a string describing the division
   */
  @Override
  public String toString() {
    if (Double.isNaN(calculate())) {
      return "Division by zero: "
          + getFirstNumber()
          + " / "
          + getSecondNumber()
          + " = "
          + "Undefined";
    }
    return "Division: "
        + getFirstNumber()
        + " / "
        + getSecondNumber()
        + " = "
        + String.format("%.2f", calculate());
  }
}
