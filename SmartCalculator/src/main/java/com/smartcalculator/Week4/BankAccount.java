package com.smartcalculator.Week4;

public class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;
    private int transactionCount;

//    Primary constructor
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

//    Secondary constructor
    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
    }

//    Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit: amount must be greater than Rs.0.");
            return;
        }
        if (amount > BankConfig.MAX_DEPOSIT) {
            System.out.println("Invalid deposit: maximum deposit is Rs." + BankConfig.MAX_DEPOSIT);
            return;
        }
        if (transactionCount >= BankConfig.MAX_DAILY_TXN) {
            System.out.println("Invalid deposit: daily transaction limit reached.");
            return;
        }
        balance += amount;
        transactionCount++;
        System.out.println("Deposit : Rs." + amount);
    }

//    Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal: amount must be greater than Rs.0.");
            return;
        }
        if (amount > BankConfig.MAX_WITHDRAWAL) {
            System.out.println("Invalid withdrawal: maximum withdrawal is Rs." + BankConfig.MAX_WITHDRAWAL);
            return;
        }
        if (amount > balance) {
            System.out.println("Invalid withdrawal: insufficient balance.");
            return;
        }
        if (transactionCount >= BankConfig.MAX_DAILY_TXN) {
            System.out.println("Invalid withdrawal: daily transaction limit reached.");
            return;
        }
        balance -= amount;
        transactionCount++;
        System.out.println("Withdrawal : Rs." + amount);
    }

    public String toString() {
        return "ACC" + accountNumber + " | " + holderName + " | Balance: Rs." + balance + " | Txn: " + transactionCount;
    }
}
