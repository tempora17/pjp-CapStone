package com.smartcalculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Perform mathematical calculation for Smart Calculator
 */
public class Calculator {

    public static final Logger LOG = LoggerFactory.getLogger(Calculator.class);

    /**
     * Calculate the results of the given operation
     *
     * @param operation the operation given for the calculation
     * @return the result of the calculation
     */
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

    /**
     * Calculate the percentage of a value
     *
     * @param value the original value
     * @param percent the percentage to calculate
     * @return the calculate percentage
     */
    public static double percentage(double value, double percent) {
        return value * percent / 100;
    }

    /**
     * Calculate the square root of a number
     *
     * @param number the number whose square root is to be calculated
     * @return the saquare root of the number
     */
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

}
