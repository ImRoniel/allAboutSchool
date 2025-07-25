package com.DSA.roniel;
import java.util.*;
public class Main {
    public static void main(String [] args){
        LinkedList<String> name = new LinkedList<String>();
        LinkedList<Integer> number = new LinkedList<Integer>();
        validationLogic myObj = new validationLogic();

        name.add("Roniel");
        name.add("reniel");

        number.add(101);
        number.add(102);

        System.out.println("Name: " + name);
        System.out.println("Number: " + number );

    }
}
