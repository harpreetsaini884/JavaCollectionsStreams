package org.rituraj.junit.advance;

public class BankingTransaction {
    public double deposit(double balance, double amount){
        balance += amount;
        System.out.println("Amount deposited successfully");
        return balance;
    }

    public double withdraw(double balance, double amount){
        if(balance < amount){
            throw new IllegalArgumentException("Insufficient Balance");
        }

        balance -= amount;
        System.out.println("Amount deducted successfully");
        return balance;
    }

    public double getBalance(double balance){
        return balance;
    }

}
