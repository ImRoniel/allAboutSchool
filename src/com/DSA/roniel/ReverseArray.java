package com.DSA.roniel;
import java.util.*;
public class ReverseArray {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want to put?");
        int wantPut = scanner.nextInt();
        int enter;
        int[] number = new int[wantPut];
        for (int i = 0; i < wantPut; i++){
            System.out.println("Enter a number:");
            enter = scanner.nextInt();
            number[i] = enter;
        }
        int start = 0;
        int end = number.length - 1;

        while(start < end){
            int toy = number[start];
            number[start] = number[end];
            number[end] = toy;

            start++;
            end--;
        }
        for (int n: number){
            System.out.println(n + " ");
        }
    }
}
