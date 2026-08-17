package com.smartcalculator.Week4;

public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1001", "Alice", 300000.0);
//         Normal transactions
        account.deposit(50000.0);
        account.withdraw(20000.0);

        account.deposit(BankConfig.MAX_DEPOSIT + 1);
        account.withdraw(-5000.0);
        account.withdraw(BankConfig.MAX_WITHDRAWAL + 1);

        System.out.println(account);

//        Daily transaction limit
        BankAccount transactionAccount = new BankAccount("2001", "Bob", 100000.0);
        for (int i = 0; i < BankConfig.MAX_DAILY_TXN; i++) {
            transactionAccount.deposit(1000.0);
        }
//        11th transaction
        transactionAccount.deposit(1000.0);
        System.out.println(transactionAccount);


        var loanAmount = LoanUtils.calculateLoanAmount( 100000.0, 12.0, 2 );
        System.out.println("Loan amount: Rs." + loanAmount);
    }
}
