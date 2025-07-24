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



    /*a method for deposit*/
   public void deposit(double amount){
//       the logic of deposit
       if (amount > 0){
           balance = balance + amount;
       } else {
           System.out.println("You need to put soomething you dumbasss idiot stupid no father AHAHAH");
       }
   }
// a method for withraw
   public void withraw(double amount){
//       validation
       if (amount > 0 && amount >= balance){
           balance = balance - amount;
       } else{
           System.out.println("You dont have enough money cause you are poor bitch ");
       }
   }

//   displaying the output
    public void displayInfo(){
        System.out.println("Account Number:" + accountNumber );
        System.out.println("Account holder:" + accountHolder);
        System.out.println("Balance:" + balance);
    }

/*A GETTER TO ACCESS THE GETBALNCE METHOD IN SUBCLASS BECAUSE IT IS PRIVATE*/
//    A GETTER IS USE TO SPAWN THESE ON ANOTHER CLASS
//    U USE IT IF YOU ARE USING ENCAPSUALTION
    protected double getBalance(){
       return balance;
    }

    protected void setBalance(double balance){
       this.balance = balance;
    }
}
