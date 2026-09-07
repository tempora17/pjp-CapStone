package com.smartcalculator;

import java.util.Scanner;

public class ATMSimulator {

  private double balance;

  public ATMSimulator(double balance) {
    this.balance = balance;
  }

  public void withdraw(double amount) {
    if (amount < 500) {
      throw new ATMRuleViolationException("Minimum withdrawal amount is Rs.500.");
    }
    else if (amount > 20000) {
      throw new ATMRuleViolationException("Maximum withdrawal amount is Rs.20,000.");
    }
    else if (amount % 500 != 0) {
      throw new ATMRuleViolationException("Withdrawal amount must be a multiple of Rs.500.");
    }
    else if (amount > balance) {
      throw new ATMRuleViolationException("Insufficient balance.");
    }
    else {
      balance -= amount;
    }
  }

  public double getBalance() {
    return balance;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    ATMSimulator atm = new ATMSimulator(3000);

    int attempts = 0;
    while (attempts < 3) {
      System.out.print("Enter withdrawal amount: ");
      double amount = scanner.nextDouble();
      try {
        atm.withdraw(amount);
        System.out.println("Withdrawal successful.");
        System.out.printf("New balance: Rs.%.2f%n", atm.getBalance());
        break;
      } catch (ATMRuleViolationException e) {
        attempts++;
        System.out.println(e.getMessage());
        if (attempts == 3) {
          System.out.println("Card locked.");
        }
      }
    }
    scanner.close();
  }
}
