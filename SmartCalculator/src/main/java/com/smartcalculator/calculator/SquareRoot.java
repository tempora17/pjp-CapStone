package com.smartcalculator.calculator;

public class SquareRoot extends Operation implements Calculable {

  /**
   * Creates a Square Root operation.
   *
   * @param number the input number
   */
  public SquareRoot(double number) {
    super(number);
  }

  /**
   * Calculates the square root of the given number.
   *
   * @return the square root of the given number. Double.Nan if number is negative.
   */
  @Override
  public double calculate() {
    if (getFirstNumber() < 0) {
      return Double.NaN;
    }
    return Math.sqrt(getFirstNumber());
  }

  /**
   * Returns a readable representation of the Square Root.
   *
   * @return a string describing the Square Root
   */
  @Override
  public String toString() {
    if (Double.isNaN(calculate())) {
      return "Square Root of Negative number: " + getFirstNumber() + " = " + "Undefined";
    }
    return "SquareRoot: " + getFirstNumber() + " = " + String.format("%.2f", calculate());
  }
}
