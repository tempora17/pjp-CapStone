package com.smartcalculator;

public class Calculator {

    public static double calculate(Operation operation){
        double firstNumber = operation.getFirstNumber();
        double secondNumber = operation.getSecondNumber();
        String operator = operation.getOperator();
        return switch(operator){
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> {
                if(secondNumber == 0) {
                    System.out.println("Cannot divide by zero");
                    yield Double.NaN;
                }
                else{
                    yield firstNumber / secondNumber;
                }
            }
            case "%" -> {
                if(secondNumber == 0) {
                    System.out.println("Cannot divide by zero");
                    yield Double.NaN;
                }
                else{
                    yield firstNumber % secondNumber;
                }
            }
            default -> {
                System.out.println("Invalid operator input");
                yield Double.NaN;
            }
        };
    }

    public static double percentage(double value, double percent) {
        return value * percent / 100;
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

}
