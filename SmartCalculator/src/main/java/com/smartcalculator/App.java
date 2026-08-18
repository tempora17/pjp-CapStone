package com.smartcalculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Entry point for the Smart Calculator CLI application
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    /**
     * Starts the Smart Calculator application
     * @param args command line argument
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LOG.info("Welcome to My Smart Calculator");
        LOG.info("Type 'exit' to quit.");

        while(true) {
            LOG.info("Enter first number (or 'exit'): ");
            String firstNumber = sc.nextLine().trim();
            if(firstNumber.equalsIgnoreCase("exit")) {
                break;
            }
            LOG.info("Enter second number: ");
            String secondNumber = sc.nextLine().trim();

            LOG.info("Enter operator (+ - * / %): ");
            String operator = sc.nextLine().trim();

            double firstNumberDouble,  secondNumberDouble;

            try{
                firstNumberDouble = Double.parseDouble(firstNumber);
            } catch (NumberFormatException e){
                LOG.warn("Please enter a valid number");
                continue;
            }

            try{
                secondNumberDouble = Double.parseDouble(secondNumber);
            } catch (NumberFormatException e){
                LOG.warn("Please enter a valid number");
                continue;
            }

            Operation operation = new Operation(firstNumberDouble, secondNumberDouble, operator);
            double result = Calculator.calculate(operation);
            if(!Double.isNaN(result)) {
                LOG.info(String.format("Result: %.2f%n", result));
            }

        }
        LOG.info("GoodBye:)");
        sc.close();
    }
}
