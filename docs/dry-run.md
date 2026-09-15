# ATM Withdrawal Dry Run

## Test Case

withdraw(7500)

Initial values:

- balance = 10000
- attempts = 0
- amount = 7500

## Step 1 — Check Minimum

Condition:

amount < 500

7500 < 500 = false

Continue to next validation.

Values:

- balance = 10000
- attempts = 0
- amount = 7500

## Step 2 — Check Maximum

Condition:

amount > 20000

7500 > 20000 = false

Continue.

Values:

- balance = 10000
- attempts = 0
- amount = 7500

## Step 3 — Check Multiple of ₹500

Condition:

amount % 500 != 0

7500 % 500 = 0

Therefore, the amount is a valid multiple of ₹500.

Values:

- balance = 10000
- attempts = 0
- amount = 7500

## Step 4 — Check Balance

Condition:

amount > balance

7500 > 10000 = false

There is sufficient balance.

## Step 5 — Deduct Amount

balance = balance - amount

balance = 10000 - 7500

balance = 2500

## Final Result

Withdrawal is successful.

Final values:

- balance = ₹2500
- attempts = 0
- amount = ₹7500