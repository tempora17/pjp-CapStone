package com.smartcalculator.calculator;

import java.math.BigDecimal;

/** Represents a mathematical operation with two operands. */
public abstract class Operation {
  private BigDecimal firstNumber;
  private BigDecimal secondNumber;

  /**
   * Creates an operation with two operands.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Operation(BigDecimal firstNumber, BigDecimal secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
  }

  /**
   * Creates an operation with one operand.
   *
   * @param firstNumber the first number
   */
  public Operation(BigDecimal firstNumber) {
    this.firstNumber = firstNumber;
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
  public BigDecimal getFirstNumber() {
    return firstNumber;
  }

  /**
   * Returns the second number.
   *
   * @return the second number
   */
  public BigDecimal getSecondNumber() {
    return secondNumber;
  }
}
