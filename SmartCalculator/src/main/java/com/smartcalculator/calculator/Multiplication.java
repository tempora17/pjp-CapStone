package com.smartcalculator.calculator;


public class Multiplication extends Operation implements Calculable {
  public Multiplication(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  @Override
  public double calculate() {
    return getFirstNumber() * getSecondNumber();
  }

  @Override
  public String toString() {
    return "Multiplication: " + getFirstNumber() + " * " + getSecondNumber() +  " = " + String.format("%.2f", calculate());
  }
}
