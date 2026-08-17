package com.smartcalculator.biweekly;

public class TypeDemo {

    public static void main(String[] args) {

        // Block 1
        int a = 9, b = 2;
        System.out.println(a / b);
//        Predicted output : 4
        System.out.println(a % b);
//        predicted output : 1
        System.out.println((double) a / b);
//        predicted output: 4.50

        // Block 2
        Integer x = 100; Integer y = 100;
        Integer p = 200; Integer q = 200;
        System.out.println(x == y);
        System.out.println(p == q);
        System.out.println(p.equals(q));
//        predicted output: true false true

//        Integer objects use a cache for values from -128 to 127 by default. Therefore x == y evaluate to "true", because both point to same memory space
//        but p and q lie outside of this region so they evaluate to false, because they point to different memory address
//        p.equals(p) evaluate to true, because instead of comparing object reference we compare the Integer value which in this case is equal

    }
}
