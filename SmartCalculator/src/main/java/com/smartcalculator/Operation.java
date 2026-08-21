package com.smartcalculator;

/** Represent a mathematical operation with two numbers and one operator */
public class Operation {
  private double firstNumber;
  private double secondNumber;
  private String operator;

  /**
   * Create a new Operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   * @param operator the mathematical operator
   */
  public Operation(double firstNumber, double secondNumber, String operator) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.operator = operator;
  }

  /** Create an empty Operation instances. Values need to be set before using this. */
  public Operation() {
    this.firstNumber = 0;
    this.secondNumber = 0;
    this.operator = null;
  }

  /**
   * Return the first number
   *
   * @return the first number
   */
  public double getFirstNumber() {
    return firstNumber;
  }

  /**
   * Set the first number
   *
   * @param firstNumber the number being set as first number
   */
  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  /**
   * Return the second number
   *
   * @return the second number
   */
  public double getSecondNumber() {
    return secondNumber;
  }

  /**
   * Set the second number
   *
   * @param secondNumber the number being set as second number
   */
  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  /**
   * Return the mathematical operator
   *
   * @return the mathematical operator
   */
  public String getOperator() {
    return operator;
  }

  /**
   * Set the operator
   *
   * @param operator the mathematical operator
   */
  public void setOperator(String operator) {
    this.operator = operator;
  }
}
