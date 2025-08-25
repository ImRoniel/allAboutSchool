package com.DSA.roniel;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
/*if they hit enter you need to show the biggest first and the smallest in the last */
public class BigArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int num = scanner.nextInt();
        int enter;
        int s;
        int[] arr = new int[num];
        for (s = 0; s < num; s++) {
            System.out.println("Enter a number" + (s+1) +":");
            arr[s] = scanner.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("smallest: " + smallest);
    }
}
