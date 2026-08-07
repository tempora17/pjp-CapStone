package com.smartcalculator;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
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
            String op = sc.nextLine().trim();

            try {
                double a = Double.parseDouble(firstNumber);
                double b = Double.parseDouble(secondNumber);

                double result = switch(op){
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> {
                        if(b == 0) {
                            System.out.println("Cannot divide by zero");
                            yield Double.NaN;
                        }
                        else{
                            yield a / b;
                        }
                    }
                    case "%" -> {
                        if(b == 0) {
                            System.out.println("Cannot divide by zero");
                            yield Double.NaN;
                        }
                        else{
                            yield a % b;
                        }
                    }
                    default -> {
                        System.out.println("Invalid operator input");
                        yield Double.NaN;
                    }
                };

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
