# Exception Handling Code Review

### Problems

1. Generic Exception – `Exception` is too broad. A specific exception should be used.

2. Bad error message – `"bad"` doesn't explain what went wrong.

3. Empty catch block – The error is completely ignored, which makes debugging difficult.

4. Unnecessary try-catch – There is no need to catch the exception here. It can be handled by the caller.

### Corrected Version

```java
/**
* Return true when the payment is processed successfully.
* Else throw an IllegalArgumentException
*/
public boolean processPayment(double amount) {
    if (amount <= 0) {
        throw new IllegalArgumentException(
                "Payment amount must be greater than zero."
        );
    }
    // deduct from account
    return true;
}
```

Here, `IllegalArgumentException` makes more sense because the amount provided by the user is invalid. The error message is also clearer, and we are not silently ignoring the problem.
