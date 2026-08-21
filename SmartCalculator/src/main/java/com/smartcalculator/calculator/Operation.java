package com.smartcalculator.calculator;

public abstract class Operation {
  private double firstNumber;
  private double secondNumber;

  public Operation(double firstNumber, double secondNumber) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
  }

  public double getFirstNumber() {
    return firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }
}
