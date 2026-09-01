package com.smartcalculator.calculator;

import com.smartcalculator.exceptions.DivisionByZeroException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division extends Operation implements Calculable {
  public static final Logger LOG = LoggerFactory.getLogger(Division.class);

  /**
   * Creates a division operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Division(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the division between two numbers using BigDecimal.
   *
   * @return the division between two numbers.
   * @throws DivisionByZeroException if division by zero.
   */
  @Override
  public double calculate() {
    if (getSecondNumber() == 0) {
      throw new DivisionByZeroException();
    }

    BigDecimal firstNumber = new BigDecimal(getFirstNumber());
    BigDecimal secondNumber = new BigDecimal(getSecondNumber());

    return firstNumber.divide(secondNumber, 10, RoundingMode.HALF_UP).doubleValue();
  }

  /**
   * Returns a readable representation of the division.
   *
   * @return a string describing the division
   */
  @Override
  public String toString() {
    try{
      return "Division: "
          + getFirstNumber()
          + " / "
          + getSecondNumber()
          + " = "
          + String.format("%.2f", calculate());
    } catch (DivisionByZeroException e) {
      return "Division by zero: "
          + getFirstNumber()
          + " / "
          + getSecondNumber()
          + " = "
          + "Undefined";
    }
  }
}
