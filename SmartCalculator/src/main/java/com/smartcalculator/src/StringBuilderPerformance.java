package com.smartcalculator.src;

public class StringBuilderPerformance {

    public static void main(String[] args) {

        int iterations = 10000;

        // String concatenation inside a loop creates many temporary String objects,
        // so StringBuilder is preferred because it uses a mutable buffer and is more efficient.
        long startString = System.nanoTime();

        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += i;
        }

        long endString = System.nanoTime();

        long startBuilder = System.nanoTime();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            builder.append(i);
        }

        StringBuilder resultBuilder = builder;
        long endBuilder = System.nanoTime();

        System.out.println("String concatenation time: "
                + (endString - startString) + " ns");

        System.out.println("StringBuilder time: "
                + (endBuilder - startBuilder) + " ns");
    }
}

