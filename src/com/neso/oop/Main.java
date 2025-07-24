package com.neso.oop;
import java.util.*;
public class Main {
    public static void main(String [] args){

        BankAccount account1 = new BankAccount("34534", "Park chaeyoung", 500000000);


        account1.displayInfo();
        account1.deposit(234);
        account1.withraw(2342342);
        account1.displayInfo();


    }
}
