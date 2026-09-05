package com.smartcalculator.week6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrecisionDemo {

  public static void main(String[] args) {

    // Demonstrate the precision problem with double.
    double doubleResult = 0.1 + 0.2;
    System.out.println("double result: " + doubleResult);

    BigDecimal first = new BigDecimal("0.1");
    BigDecimal second = new BigDecimal("0.2");

    BigDecimal bigDecimalResult = first.add(second);

    System.out.println("BigDecimal result: " + bigDecimalResult);
  }
}
