package com.smartcalculator;

import java.util.Scanner;

/*
Input: First Number: 10, Second Number: 3, Operator: + -> Expected Output: 13
Input: First Number: 10, Second Number: 0, Operator: / -> Expected Output: Error: Cannot divide by zero
Input: First Number: 10, Second Number: 3, Operator: ^ -> Expected Output: Error: Invalid operator input "^"
 */
public class App {
    private static double calculate(double firstNumber, double secondNumber, String op){
        return switch(op){
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> {
                if(secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    yield Double.NaN;
                }
                else{
                    yield firstNumber / secondNumber;
                }
            }
            case "%" -> {
                if(secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    yield Double.NaN;
                }
                else{
                    yield firstNumber % secondNumber;
                }
            }
            default -> {
                System.out.println("Error: Invalid operator input \"" + op + "\"");
                yield Double.NaN;
            }
        };
    }

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
                double firstNumberDouble = Double.parseDouble(firstNumber);
                double secondNumberDouble = Double.parseDouble(secondNumber);

                double result = calculate(firstNumberDouble, secondNumberDouble, op);

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
