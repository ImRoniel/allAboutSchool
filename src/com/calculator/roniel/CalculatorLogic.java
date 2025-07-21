package com.calculator.roniel;

public class CalculatorLogic  {

    private static char con;

    public static double calculate(double f, double s, char o, char con) {
        CalculatorLogic.con = con;
        double result;
        switch (o){
            case '+':
                result = f + s;
                break;
            case '-':
                result = f - s;
                break;
            case '*':
                result= f * s;
                break;
            case '/':
                if (s == 0){
                    System.out.println("Cannot be divided by zero!");
                } else {
                    return 0;
                }
                result = f / s;
                break;
            default:
                System.out.println("Out of bounds ");
                return 0;
        }
        return result;
    }
}
