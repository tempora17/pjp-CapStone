package com.smartcalculator.calculator;

public class Addition extends Operation implements Calculable {

  public Addition(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  @Override
  public double calculate() {
    return getFirstNumber() + getSecondNumber();
  }

  @Override
  public String toString() {
    return "Addition: " + getFirstNumber() + " + " + getSecondNumber() + " = " + String.format("%.2f", calculate());
  }
}
