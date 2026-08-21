package com.smartcalculator;

import com.smartcalculator.calculator.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Demo {
  public static final Logger LOG = LoggerFactory.getLogger(Demo.class);

  public static void main(String[] args) {
    List<Calculable> operations = List.of(
        new Addition(10, 4),
        new Subtraction(10, 4),
        new Multiplication(10, 4),
        new Division(10, 4),
        new Modulo(10, 4),
        new Division(10, 0),
        new Modulo(10, 0)
    );

    for (Calculable operation : operations) {
      LOG.info(operation.toString());
    }
  }
}
