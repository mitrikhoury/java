package oop.java_oop.Bank_Account;

import java.util.Random;

public class BankAccount {
    
    private static int totalAccounts = 0;
    private static double totalAmount = 0.0;

    private String accountNumber; 
    private double checkingBalance; 
    private double savingsBalance;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        this.accountNumber = generateAccountNumber();
        
        totalAccounts++;
        totalAmount += (checkingBalance + savingsBalance);
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
 
    public static int getTotalAccounts() {
    return totalAccounts;
    }

    public static double getTotalAmount() {
    return totalAmount;
    }
    public void deposit(double amount, String accountType) {

        if (accountType.equals("checking")) {
            checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            savingsBalance += amount;
        } else {
            throw new IllegalArgumentException("Invalid account type. Choose 'checking' or 'savings'.");
        }
        totalAmount += amount;

    }

    public void withdraw(double amount , String accountType){
 
     if(accountType.equals("checking")){
       if(checkingBalance >= amount){
         checkingBalance -= amount;
         totalAmount -= amount;
       } else {
        throw new IllegalArgumentException("Insufficient funds in checking account.");
       }
     } else if(accountType.equals("savings")){
        if(savingsBalance >= amount){
          savingsBalance -= amount;
          totalAmount -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds in saving account.");
        }
     } else {
        throw new IllegalArgumentException("Invalid account type. Choose 'checking' or 'savings'.");
     }

    }

    public double totalMoney(){
        return checkingBalance + savingsBalance;
    }

      // Private method to generate a random ten-digit account number
    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(rand.nextInt(10));
        }
        return accountNumber.toString();
    }

}
