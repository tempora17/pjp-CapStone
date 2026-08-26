package com.smartcalculator.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modulo extends Operation implements Calculable {
  public static final Logger LOG =  LoggerFactory.getLogger(Modulo.class);

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
   * @return the Modulo between two numbers. Double.NaN if Modulo by zero.
   */
  @Override
  public double calculate() {
    if(getSecondNumber() == 0){
      LOG.warn("Cannot Modulo by zero");
      return Double.NaN;
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
    if(Double.isNaN(calculate())){
      return "Modulo by zero: " + getFirstNumber() + " / " + getSecondNumber() +  " = " + "Undefined";
    }
    return "Modulo: " + getFirstNumber() + " % " + getSecondNumber() +  " = " + String.format("%.2f", calculate());
  }
}
