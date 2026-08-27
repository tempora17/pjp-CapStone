package com.smartcalculator.calculator;

public class Subtraction extends Operation implements Calculable {

  public Subtraction(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  @Override
  public double calculate() {
    return getFirstNumber() - getSecondNumber();
  }

  @Override
  public String toString() {
    return "Subtraction: "
        + getFirstNumber()
        + " - "
        + getSecondNumber()
        + " = "
        + String.format("%.2f", calculate());
  }
}
