# Square Root Pseudocode

```
FUNCTION squareRoot(number):
    IF number < 0 THEN
        THROW SquareRootOfNegativeException("Cannot sqrt a negative number")
    END IF
    RETURN Math.sqrt(number)
END FUNCTION
```

## Edge Case
If the input number is negative, the function throws an `SquareRootOfNegativeException` instead of trying to calculate its square root.

```
FUNCTION percentage(number1, number2):
    return (number1 / number2) * 100
END FUNCTION
```

```
FUNCTION division(number1, number2):
    IF number2 == 0 THEN
        THROW DivisionByZeroException("Cannot divide by zero")
    END IF
    return number1 / number2
END FUNCTION
```

```
FUNCTIONmodulo(number1, number2):
    IF number2 == 0 THEN
        THROW ModuloByZeroException("Cannot Modulo by zero")
    END IF
    return number1 % number2
END FUNCTION
```
