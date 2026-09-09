package com.smartcalculator.calculator;

import java.math.BigDecimal;

public class Subtraction extends Operation implements Calculable {

  public Subtraction(BigDecimal firstNumber, BigDecimal secondNumber) {
    super(firstNumber, secondNumber);
  }

  @Override
  public double calculate() {
    return getFirstNumber().subtract(getSecondNumber()).doubleValue();
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
