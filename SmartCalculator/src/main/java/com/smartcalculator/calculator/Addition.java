package com.smartcalculator.calculator;


/**
 * Represents an addition operation.
 */
public class Addition extends Operation implements Calculable {

  /**
   * Creates an addition operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Addition(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the sum of the two numbers.
   *
   * @return the sum of the two numbers
   */
  @Override
  public double calculate() {
    return getFirstNumber() + getSecondNumber();
  }

  /**
   * Returns a readable representation of the addition.
   *
   * @return a string describing the addition
   */
  @Override
  public String toString() {
    return "Addition: " + getFirstNumber() + " + " + getSecondNumber() + " = " + String.format("%.2f", calculate());
  }
}
