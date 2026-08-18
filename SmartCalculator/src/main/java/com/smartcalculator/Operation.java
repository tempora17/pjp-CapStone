package com.smartcalculator;

/**
 * Represent a mathematical operation with two numbers and one operator
 */
public class Operation {
    private double firstNumber;
    private double secondNumber;
    private String operator;

    /**
     * Create a new Operation.
     *
     * @param firstNumber the first number
     * @param secondNumber the second number
     * @param operator the mathematical operator
     */
    public Operation(double firstNumber, double secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    /**
     * Return the first number
     * @return the first number
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Return the second number
     * @return the second number
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Return the mathematical operator
     * @return the mathematical operator
     */
    public String getOperator() {
        return operator;
    }
}
