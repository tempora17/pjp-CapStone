package com.smartcalculator.biweekly;


/**
 * Represents a bank account with a balance and transaction tracking.
 */
public class BankAccount {

    private final String accountNumber;
    private final String holderName;
    private double balance;
    private int transactionCount;

    /**
     * Creates a bank account with the given initial balance.
     *
     * @param accountNumber account number
     * @param holderName name of the account holder
     * @param initialBalance starting balance
     */
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

    /**
     * Creates a bank account with an initial balance of zero.
     *
     * @param accountNumber unique account number
     * @param holderName name of the account holder
     */
    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

    /**
     * Deposits money into the account.
     *
     * @param amount amount to deposit
     * @throws IllegalArgumentException if the amount is not positive
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;
        transactionCount++;
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount amount to withdraw
     * @throws IllegalArgumentException if the amount is not positive
     *         or exceeds the current balance
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= amount;
        transactionCount++;
    }

    /**
     * Returns the current account balance.
     *
     * @return current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the number of successful deposits and withdrawals.
     *
     * @return transaction count
     */
    public int getTransactionCount() {
        return transactionCount;
    }

    /**
     * Returns summary of the account.
     *
     * @return account summary
     */
    public String getSummary() {
        return String.format(
                "Account Number: %s | Holder: %s | Balance: ₹%.2f | Transactions: %d",
                accountNumber,
                holderName,
                balance,
                transactionCount
        );
    }

    /**
     * Demonstrates the BankAccount class.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("101", "Aniket Singh", 5000.0);

        BankAccount account2 = new BankAccount("101", "XYZ");

        account1.deposit(2000.0);
        account1.withdraw(1000.0);

        account2.deposit(10000.0);
        account2.withdraw(2500.0);

        try {
            account1.withdraw(-500.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation: " + e.getMessage());
        }

        System.out.println(account1.getSummary());
        System.out.println(account2.getSummary());
    }
}
