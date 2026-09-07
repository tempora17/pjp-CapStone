package com.smartcalculator.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Percentage extends Operation implements Calculable {

  /**
   * Creates a Percentage operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Percentage(BigDecimal firstNumber, BigDecimal secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the percentage firstNumber%secondNumber.
   *
   * @return the percentage of the firstNumber w.r.t secondNumber
   */
  @Override
  public double calculate() {
    return getFirstNumber().multiply(getSecondNumber()).divide(BigDecimal.valueOf(100.0), 10,RoundingMode.HALF_UP).doubleValue();
  }

  /**
   * Returns a readable representation of the percentage.
   *
   * @return a string describing the percentage
   */
  @Override
  public String toString() {
    return "Percentage: "
        + getFirstNumber()
        + " % of "
        + getSecondNumber()
        + " = "
        + String.format("%.2f", calculate());
  }
}
