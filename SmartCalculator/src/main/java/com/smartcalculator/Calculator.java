package com.smartcalculator;

import com.smartcalculator.calculator.*;
import com.smartcalculator.exceptions.InvalidOperationException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Perform mathematical calculation for Smart Calculator */
public class Calculator {

  public static final Logger LOG = LoggerFactory.getLogger(Calculator.class);
  public static final Scanner scanner = new Scanner(System.in);

  private Calculator() {
    //    Prevent initialization
  }

  /** Run the Smart Calculator Application */
  public static void run() {
    LOG.info("Welcome to My Smart Calculator");
    LOG.info("Type 'exit' to quit.");

    while (true) {
      try {
        LOG.info("Enter first number (or 'exit'): ");
        double number1, number2;

        String firstNumber = scanner.nextLine().trim();
        if (firstNumber.equalsIgnoreCase("exit")) {
          break;
        }

        try {
          number1 = Double.parseDouble(firstNumber);
        } catch (NumberFormatException e) {
          LOG.warn("Please enter a valid First number");
          continue;
        }

        LOG.info("Enter operator (+ - * / % sqrt pect): ");
        String operator = scanner.nextLine().trim();

        if (!validOperationInput(operator)) {
          throw new InvalidOperationException("Invalid operation: " + operator);
        }

        if (operator.equals("sqrt")) {
          Operation operation = new SquareRoot(number1);
          LOG.info(operation.toString());
          continue;
        }

        LOG.info("Enter second number: ");
        String secondNumber = scanner.nextLine().trim();

        try {
          number2 = Double.parseDouble(secondNumber);
        } catch (NumberFormatException e) {
          LOG.warn("Please enter a valid Second number");
          continue;
        }

        Operation operation =
            switch (operator) {
              case "+" -> new Addition(number1, number2);
              case "-" -> new Subtraction(number1, number2);
              case "*" -> new Multiplication(number1, number2);
              case "/" -> new Division(number1, number2);
              case "%" -> new Modulo(number1, number2);
              case "pect" -> new Percentage(number1, number2);
              default -> {
                throw new InvalidOperationException("Invalid Operation: " + operator);
              }
            };
        LOG.info(operation.toString());
      } catch (InvalidOperationException e) {
        LOG.warn(e.getMessage());
        LOG.info("Please enter a valid Operation");
      }
    }
    LOG.info("GoodBye:)");
    scanner.close();
  }

  private static boolean validOperationInput(String operation) {
    return operation.equals("pect")
        || operation.equals("sqrt")
        || operation.equals("+")
        || operation.equals("-")
        || operation.equals("*")
        || operation.equals("/")
        || operation.equals("%");
  }
}
