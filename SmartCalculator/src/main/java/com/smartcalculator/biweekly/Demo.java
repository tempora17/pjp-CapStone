package com.smartcalculator.biweekly;

public class Demo {
    public static void main(String[] args) {
        double rounded = MathUtils.roundToTwoDecimalPlaces(123.4567);

        double simpleInterest = MathUtils.calculateSimpleInterest(10000, 5, 2);

        double compoundInterest = MathUtils.calculateCompoundInterest(10000, 5, 4, 2);

        System.out.println("Rounded value: " + rounded);
        System.out.println("Simple interest: " + simpleInterest);
        System.out.println("Compound interest: " + MathUtils.roundToTwoDecimalPlaces(compoundInterest));
    }
}
