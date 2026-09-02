# Code Review Checklist
Before committing code, I check the following:

1. The code follows Java naming conventions.
2. Public classes and methods have Javadoc comments.
3. The code does not contain unnecessary duplicate logic.
4. Exceptions are handled properly and the program does not crash because of invalid user input.
5. The code is formatted and easy to read (for this I use Google Java Format).
6. The project compiles successfully with `mvn compile`.
7. The code give meaningfull error messages whenever an error occurs.

## Self-Review
During the review, I noticed that for some of the error messages I am logging it as INFO instead I should separate the concern and also log some as WARN wherever necessary.
This issue was at two places and I fixed them while self-reviewing.

