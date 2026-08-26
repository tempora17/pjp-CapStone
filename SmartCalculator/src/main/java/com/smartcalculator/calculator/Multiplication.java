package com.smartcalculator.calculator;

public class Multiplication extends Operation implements Calculable {

  /**
   * Creates a Multiplication operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Multiplication(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the Multiplication of the two numbers.
   *
   * @return the Multiplication of the two numbers
   */
  @Override
  public double calculate() {
    return getFirstNumber() * getSecondNumber();
  }

  /**
   * Returns a readable representation of the Multiplication.
   *
   * @return a string describing the Multiplication
   */
  @Override
  public String toString() {
    return "Multiplication: "
        + getFirstNumber()
        + " * "
        + getSecondNumber()
        + " = "
        + String.format("%.2f", calculate());
  }
}
