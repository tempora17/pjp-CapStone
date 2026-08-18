package com.smartcalculator;

public class Operation {
    private double firstNumber;
    private double secondNumber;
    private String operator;

    public Operation(double firstNumber, double secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }
}
