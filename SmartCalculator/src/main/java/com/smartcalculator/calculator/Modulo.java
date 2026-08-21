package com.smartcalculator.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modulo extends Operation implements Calculable {
  public static final Logger LOG =  LoggerFactory.getLogger(Modulo.class);

  public Modulo(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  @Override
  public double calculate() {
    if(getSecondNumber() == 0){
      LOG.warn("Cannot Modulo by zero");
      return Double.NaN;
    }
    return getFirstNumber() % getSecondNumber();
  }

  @Override
  public String toString() {
    return "Modulo: " + getFirstNumber() + " % " + getSecondNumber() +  " = " + String.format("%.2f", calculate());
  }
}
