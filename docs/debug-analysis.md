# Debug Analysis

## Bug 1 — Incorrect Initial Value

The original code contains: int sum = 1;

The sum should start at 0 because no numbers have been added yet.

Using 1 adds an extra value to the final result.

The corrected code is: int sum = 0;

## Bug 2 — Incorrect Even Number Condition
The original code contains:
    if (i % 2 == 1)
When a number is even, dividing it by 2 produces a remainder of 0.

Therefore, the correct condition is:
    if (i % 2 == 0)

## How the Bugs Were Identified
For n = 10, the expected result is:

2 + 4 + 6 + 8 + 10 = 30

The original condition selects odd numbers:

1, 3, 5, 7, 9

It also starts the sum at 1.

This produces an incorrect result of 26.

After changing the initial value to 0 and changing the condition to i % 2 == 0, the method returns the expected result of 30.