package com.smartcalculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    public static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

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
                    LOG.warn("Cannot divide by zero");
                    yield Double.NaN;
                }
                else{
                    yield firstNumber / secondNumber;
                }
            }
            case "%" -> {
                if(secondNumber == 0) {
                    LOG.warn("Cannot divide by zero");
                    yield Double.NaN;
                }
                else{
                    yield firstNumber % secondNumber;
                }
            }
            default -> {
                LOG.warn("Invalid operator input");
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
