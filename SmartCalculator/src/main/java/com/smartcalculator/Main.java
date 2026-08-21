package com.smartcalculator;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Entry point for the Smart Calculator CLI application */
public class Main {
  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  /**
   * Starts the Smart Calculator application
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LOG.info("Welcome to My Smart Calculator");
    LOG.info("Type 'exit' to quit.");

    Operation operation = new Operation();

    while (true) {
      LOG.info("Enter first number (or 'exit'): ");
      double firstNumberDouble, secondNumberDouble;

      String firstNumber = sc.nextLine().trim();
      if (firstNumber.equalsIgnoreCase("exit")) {
        break;
      }

      try {
        firstNumberDouble = Double.parseDouble(firstNumber);
      } catch (NumberFormatException e) {
        LOG.warn("Please enter a valid First number");
        continue;
      }

      LOG.info("Enter second number: ");
      String secondNumber = sc.nextLine().trim();

      try {
        secondNumberDouble = Double.parseDouble(secondNumber);
      } catch (NumberFormatException e) {
        LOG.warn("Please enter a valid Second number");
        continue;
      }

      LOG.info("Enter operator (+ - * / %): ");
      String operator = sc.nextLine().trim();

      operation.setFirstNumber(firstNumberDouble);
      operation.setSecondNumber(secondNumberDouble);
      operation.setOperator(operator);

      double result = Calculator.calculate(operation);
      if (!Double.isNaN(result)) {
        LOG.info(String.format("Result: %.2f%n", result));
      }
    }
    LOG.info("GoodBye:)");
    sc.close();
  }
}
