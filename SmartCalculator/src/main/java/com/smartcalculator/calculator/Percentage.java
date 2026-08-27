package com.smartcalculator.calculator;

public class Percentage extends Operation implements Calculable {

  /**
   * Creates a Percentage operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Percentage(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the percentage firstNumber%secondNumber.
   *
   * @return the percentage of the firstNumber w.r.t secondNumber
   */
  @Override
  public double calculate() {
    return getFirstNumber() * getSecondNumber() / 100.0;
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
        + " % "
        + getSecondNumber()
        + " = "
        + String.format("%.2f", calculate());
  }
}
