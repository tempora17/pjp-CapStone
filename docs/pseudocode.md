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
