package com.neso.oop;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

   public BankAccount(String accountNumber, String accountHolder, double balance){
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = balance;
   }

   public void deposit(double amount){
       if (amount > 0){
           balance = balance + amount;
       } else {
           System.out.println("You need to put soomething you dumbasss idiot stupid no father AHAHAH");
       }
   }

   public void withraw(double amount){
       if (amount > 0 && amount >= balance){
           balance = balance - amount;
       } else{
           System.out.println("You dont have enough money cause you are poor bitch ");
       }
   }

    public void displayInfo(){
        System.out.println("Account Number:" + accountNumber );
        System.out.println("Account holder:" + accountHolder);
        System.out.println("Balance:" + balance);
    }

    protected double getBalance(){
       return balance;
    }

    protected void setBalance(double balance){
       this.balance = balance;
    }
}
