package oop.java_oop.Bank_Account;

public class BamkAccountTest {
    
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(150.0, 220.0);
        System.out.println("Account Number: " + account1.getAccountNumber());

        account1.deposit(500.0, "savings");
        account1.deposit(134.0, "checking");
        account1.withdraw(145.0 , "checking");

        System.out.println("Checking Balance: " + account1.getCheckingBalance()+"$");
        System.out.println("Savings Balance: " + account1.getSavingsBalance()+"$");
        System.out.println("Total Money: " + account1.totalMoney()+"$");

    }
}
