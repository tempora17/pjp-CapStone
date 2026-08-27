package com.smartcalculator.calculator;

/** Represents a mathematical operation with two operands. */
public abstract class Operation {
  private double firstNumber;
  private double secondNumber;

  /**
   * Creates an operation with two operands.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Operation(double firstNumber, double secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
  }

  /**
   * Creates an operation with one operand.
   *
   * @param firstNumber the first number
   */
  public Operation(double firstNumber) {
    this(firstNumber, Double.NaN);
  }

  /**
   * Calculates the result of the operation.
   *
   * @return the result of the operation
   */
  public abstract double calculate();

  /**
   * Returns the first number.
   *
   * @return the first number
   */
  public double getFirstNumber() {
    return firstNumber;
  }

  /**
   * Returns the second number.
   *
   * @return the second number
   */
  public double getSecondNumber() {
    return secondNumber;
  }
}
