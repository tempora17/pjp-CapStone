package com.smartcalculator.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Division extends Operation implements Calculable{
  public static final Logger LOG = LoggerFactory.getLogger(Division.class);

  public Division(double firstNumber, double secondNumber) {
    super(firstNumber, secondNumber);
  }

  @Override
  public double calculate() {
    if(getSecondNumber() == 0){
      LOG.warn("Cannot divide by zero");
      return Double.NaN;
    }
    return getFirstNumber() / getSecondNumber();
  }

  @Override
  public String toString(){
    return "Division: " + getFirstNumber() + " / " + getSecondNumber() +  " = " + String.format("%.2f", calculate());
  }
}
