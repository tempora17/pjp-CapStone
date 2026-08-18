package com.smartcalculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Smart Calculator");
        System.out.println("Type 'exit' to quit.");

        while(true) {
            System.out.print("Enter first number (or 'exit'): ");
            String firstNumber = sc.nextLine().trim();
            if(firstNumber.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter second number: ");
            String secondNumber = sc.nextLine().trim();

            System.out.print("Enter operator (+ - * / %): ");
            String operator = sc.nextLine().trim();

            try {
                double firstNumberDouble = Double.parseDouble(firstNumber);
                double secondNumberDouble = Double.parseDouble(secondNumber);

                Operation operation = new Operation(firstNumberDouble, secondNumberDouble, operator);

                double result = Calculator.calculate(operation);

                if(!Double.isNaN(result)) {
                    System.out.printf("Result: %.2f%n", result);
                }
            }catch(NumberFormatException e) {
                System.out.println("Please enter a valid number");
                continue;
            }
        }
        System.out.println("GoodBye:)");
    }
}
