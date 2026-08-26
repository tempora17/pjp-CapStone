package com.smartcalculator;

import com.smartcalculator.calculator.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/** Perform mathematical calculation for Smart Calculator */
public class Calculator {

  public static final Logger LOG = LoggerFactory.getLogger(Calculator.class);
  public static final Scanner scanner = new Scanner(System.in);

  private Calculator(){
//    Prevent initialization
  }

  /**
  * Run the Smart Calculator Application
  */
  public static void run(){
    LOG.info("Welcome to My Smart Calculator");
    LOG.info("Type 'exit' to quit.");

    while (true) {
      LOG.info("Enter first number (or 'exit'): ");
      double firstNumberDouble, secondNumberDouble;

      String firstNumber = scanner.nextLine().trim();
      if (firstNumber.equalsIgnoreCase("exit")) {
        break;
      }

      try {
        firstNumberDouble = Double.parseDouble(firstNumber);
      } catch (NumberFormatException e) {
        LOG.warn("Please enter a valid First number");
        continue;
      }

      LOG.info("Enter operator (+ - * / % sqrt pect): ");
      String operator = scanner.nextLine().trim();

      if(operator.equals("sqrt")){
        Operation operation = new SquareRoot(firstNumberDouble);
        LOG.info(operation.toString());
        continue;
      }

      LOG.info("Enter second number: ");
      String secondNumber = scanner.nextLine().trim();

      try {
        secondNumberDouble = Double.parseDouble(secondNumber);
      } catch (NumberFormatException e) {
        LOG.warn("Please enter a valid Second number");
        continue;
      }

      Operation operation = switch (operator) {
        case "+" -> new Addition(firstNumberDouble, secondNumberDouble);
        case "-" -> new Subtraction(firstNumberDouble, secondNumberDouble);
        case "*" -> new Multiplication(firstNumberDouble, secondNumberDouble);
        case "/" -> new Division(firstNumberDouble, secondNumberDouble);
        case "%" -> new Modulo(firstNumberDouble, secondNumberDouble);
        case "pect" -> new Percentage(firstNumberDouble, secondNumberDouble);
        default ->  {
          LOG.warn("Invalid operator: " + operator);
          yield null;
        }
      };

      if(operation != null){
        LOG.info(operation.toString());
      }
    }
    LOG.info("GoodBye:)");
    scanner.close();
  }
}
