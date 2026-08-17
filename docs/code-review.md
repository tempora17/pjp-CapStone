# Code Review

## Original Method

```java
public double x(double a, double b, int c) { 
    double r = 1; 
    for(int i=0;i<c;i++) {
        r = r*(1+b);
    } 
    return a*r; 
}
```

## Five Clean Code Problem
1. Meaningless method name: "x" does not describe the operation.
2. Meaningless parameter names: "a", "b", and "c" do not explain their purpose.
3. Poor formatting/readability: the loop and calculation are compressed into one line.
4. Unclear variable name: "r" does not describe the value being stored.
5. Missing documentation: The method has no Javadoc explaining its purpose, parameters, and return value.

```java
/**
 * Calculates the final amount using compound growth.
 *
 * @param principal initial amount
 * @param rate growth rate per period
 * @param periods number of periods
 * @return final amount after compound growth
 */
public double calculateCompoundAmount(double principal, double rate, int periods) {
    double amount = 1;

    for (int i = 0; i < periods; i++) {
        amount *= 1 + rate;
    }

    return principal * amount;
}
```