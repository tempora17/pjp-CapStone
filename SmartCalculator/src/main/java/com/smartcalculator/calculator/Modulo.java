package com.smartcalculator.calculator;

import com.smartcalculator.exceptions.ModuloByZeroException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modulo extends Operation implements Calculable {
  public static final Logger LOG = LoggerFactory.getLogger(Modulo.class);

  /**
   * Creates a Modulo operation.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   */
  public Modulo(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  /**
   * Calculates the Modulo between two numbers.
   *
   * @return the Modulo between two numbers.
   * @throws ModuloByZeroException when modulo by zero.
   */
  @Override
  public double calculate() {
    if (getSecondNumber() == 0) {
      throw new ModuloByZeroException();
    }
    return getFirstNumber() % getSecondNumber();
  }

  /**
   * Returns a readable representation of the Modulo.
   *
   * @return a string describing the Modulo
   */
  @Override
  public String toString() {
    try {
      return "Modulo: "
          + getFirstNumber()
          + " % "
          + getSecondNumber()
          + " = "
          + String.format("%.2f", calculate());
    } catch(ModuloByZeroException e){
      return "Modulo by zero: "
          + getFirstNumber()
          + " / "
          + getSecondNumber()
          + " = "
          + "Undefined";
    }
  }
}
