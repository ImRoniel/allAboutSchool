package com.DSA.roniel;
import javax.lang.model.element.Name;

import java.util.*;

public class Araylist {
    public static void main(String [] args){
        ArrayList<String> contactaName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = 4;
        for(int i = 1; i < n ;i++ ){
            System.out.print("Enter contact "+ i +  ":");
            String name = scanner.nextLine();
            contactaName.add(name);
        }
        System.out.println("************************");
        System.out.println("Contacts:");
        for(String s: contactaName){
            System.out.println(s);
        }
        System.out.println(" ");
        System.out.println("Removing the second Contact...");

        contactaName.remove(1);
        System.out.println(" ");
        System.out.println("Final list:");
        for(String litst: contactaName){
            System.out.println(litst);
        }

    }
}