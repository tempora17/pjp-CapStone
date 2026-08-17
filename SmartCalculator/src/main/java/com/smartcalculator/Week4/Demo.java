package com.smartcalculator.Week4;

public class Demo {
    public static void main(String[] args) {
//        creating two account
        BankAccount account1 = new BankAccount("1001", "Alice", 5000.0);
        BankAccount account2 = new BankAccount("1002", "Bob", 3000.0);

        System.out.println("Account 1 Operations");
        account1.deposit(1000.0);
        account1.withdraw(500.0);
//        Invalid operation
        account1.withdraw(10000.0);

        System.out.println("Account 2 Operations");
        account2.deposit(2000.0);
        account2.withdraw(1000.0);

//        Invalid operation
        account2.deposit(-500.0);

        System.out.println("Finally Account Details");
        System.out.println(account1);
        System.out.println(account2);

    }
}
