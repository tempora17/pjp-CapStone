```java
public void transfer(String from, String to, double amt) {
 try {
 accounts.get(from).setBalance(accounts.get(from).getBalance() - amt);
 accounts.get(to).setBalance(accounts.get(to).getBalance() + amt);
 } catch (Exception e) {
 // ignore
 }
}
```

# Code Review

1. Using double for money

- Severity: Blocker
- `double` can give wrong values sometimes because of precision issues.
- Fix: Use `BigDecimal` for money and transfer amounts.

2. Ignoring exceptions

- Severity: Major
- The `catch` block is empty, so if something goes wrong we won't know about it.
- Fix: Handle the exception properly or show a useful error message.

3. No account validation

- Severity: Major
- The code directly assumes that both accounts are present. If one is not there, it can give a `NullPointerException`.
- Fix: Check both accounts before doing the transfer.

4. No amount/balance validation

- Severity: Major
- The code does not check if the amount is negative or if the sender has enough money.
- Fix: Check that the amount is positive and the sender has enough balance before transferring.
