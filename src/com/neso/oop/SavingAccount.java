package com.neso.oop;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}
