package com.smartcalculator.calculator;

import com.smartcalculator.exceptions.SquareRootOfNegativeException;

public class SquareRoot extends Operation implements Calculable {

  /**
   * Creates a Square Root operation.
   *
   * @param number the input number
   */
  public SquareRoot(double number) {
    super(number);
  }

  /**
   * Calculates the square root of the given number.
   *
   * @return the square root of the given number.
   * @throws SquareRootOfNegativeException when the given number is negative.
   */
  @Override
  public double calculate() {
    if (getFirstNumber() < 0) {
      throw new SquareRootOfNegativeException();
    }
    return Math.sqrt(getFirstNumber());
  }

  /**
   * Returns a readable representation of the Square Root.
   *
   * @return a string describing the Square Root
   */
  @Override
  public String toString() {
    try{
      return "SquareRoot: " + getFirstNumber() + " = " + String.format("%.2f", calculate());
    } catch(SquareRootOfNegativeException e){
      return "Square Root of Negative number: " + getFirstNumber() + " = " + "Undefined";
    }
  }
}
