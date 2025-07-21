package com.calculator.roniel;
import com.DSA.roniel.Araylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static com.calculator.roniel.CalculatorLogic.calculate;

public class CalculatorMain {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        CalculatorLogic myObj = new CalculatorLogic();

        System.out.println("Enter your First Number:");
        double f = scanner.nextDouble();

        System.out.println("Enter your First Second:");
        double s = scanner.nextDouble();

        System.out.println("Enter an operator(+, -, *, / ):");
        char o = scanner.next().charAt(0);

        double result = calculate(f, s , o);
        System.out.println("Result: " + result);

        System.out.println("Calculate Again:(y/n)");
        char con = scanner.next().charAt(0);

    }
}
