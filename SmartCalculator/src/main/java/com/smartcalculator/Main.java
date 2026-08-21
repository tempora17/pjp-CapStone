package com.smartcalculator;

import java.util.Scanner;

import com.smartcalculator.calculator.*;
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

      Operation operation = switch (operator) {
        case "+" -> new Addition(firstNumberDouble, secondNumberDouble);
        case "-" -> new Subtraction(firstNumberDouble, secondNumberDouble);
        case "*" -> new Multiplication(firstNumberDouble, secondNumberDouble);
        case "/" -> new Division(firstNumberDouble, secondNumberDouble);
        case "%" -> new Modulo(firstNumberDouble, secondNumberDouble);
        default ->  {
          LOG.warn("Invalid operator: " + operator);
          yield null;
        }
      };

      if(operation != null){
        LOG.info(operation.toString());
      }
//      double result = Calculator.calculate(operation);
//
//      if (!Double.isNaN(result)) {
//        LOG.info(operation.toString());
//      }
    }
    LOG.info("GoodBye:)");
    sc.close();
  }
}
