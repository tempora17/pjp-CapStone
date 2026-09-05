package com.smartcalculator.week6;

public class PaymentService {

  private double balance;

  public PaymentService(double balance) {
    this.balance = balance;
  }

  public void processPayment(double amount) {

    if (amount < 0) {
      throw new InvalidAmountException("Invalid amount: Payment amount cannot be negative.");
    }

    if (amount > 200000) {
      throw new DailyLimitExceededException("Daily limit exceeded: Maximum payment limit is Rs.200000.", amount);
    }

    if (amount > balance) {
      double shortfall = amount - balance;

      throw new InsufficientFundsException("Insufficient funds: Shortfall is Rs." + shortfall, shortfall);
    }

    balance -= amount;

    System.out.println("Payment of Rs." + amount + " processed. New balance: Rs." + balance);
  }
}
