package com.smartcalculator;

import com.smartcalculator.calculator.*;
import java.math.BigDecimal;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
  public static final Logger LOG = LoggerFactory.getLogger(Demo.class);

  public static void main(String[] args) {
    List<Calculable> operations =
        List.of(
            new Addition(BigDecimal.valueOf(10), BigDecimal.valueOf(20)),
            new Subtraction(BigDecimal.valueOf(10), BigDecimal.valueOf(20)),
            new Multiplication(BigDecimal.valueOf(10), BigDecimal.valueOf(20)),
            new Division(BigDecimal.valueOf(10), BigDecimal.valueOf(20)),
            new Modulo(BigDecimal.valueOf(10), BigDecimal.valueOf(20)),
            new Division(BigDecimal.valueOf(10), BigDecimal.valueOf(0)),
            new Modulo(BigDecimal.valueOf(10), BigDecimal.valueOf(0)));

    for (Calculable operation : operations) {
      LOG.info(operation.toString());
    }
  }
}
