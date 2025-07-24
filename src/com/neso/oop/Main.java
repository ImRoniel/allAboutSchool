package com.neso.oop;
import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Account Number:");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter your Account Holder:");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter your Initial balance:");
        double balance = scanner.nextDouble();

        System.out.print("Enter Interest Rate (e.g., 0.05 for 5%)");
        double interestRate = scanner.nextDouble();

        SavingAccount account1 = new SavingAccount(accountNumber, accountHolder, balance, interestRate);
        int choice;
        do {
            System.out.println("1. Display Account info:");
            System.out.println("2. Deposit:");
            System.out.println("3. Withraw:");
            System.out.println("4. Apply interest:");
            System.out.println("5. Exit:");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    account1.displayInfo();
                    break;
                case 2:
                    System.out.println("depoit Money:");
                    double depositAmmount = scanner.nextDouble();
                    account1.deposit(depositAmmount);
                    break;
                case 3:
                    System.out.println("Withraw Money:");
                    double withrawAmmount = scanner.nextDouble();
                    account1.deposit(withrawAmmount);
                    break;
                case 4:
                    account1.applyInterest();
                    System.out.println("Interest Applied");
                    break;
                case 5:
                    System.out.println("Exiting Godbye ");
                    break;
                default:
                    System.out.println("Invalid input!");

            }
        }while (choice != 5);





    }
}
