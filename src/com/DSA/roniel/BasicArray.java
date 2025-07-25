package com.DSA.roniel;
import java.util.*;

/*✅ Problem Statement:
Given an array of numbers, find the largest number.

💡 Logic:
Start with the first number as max
Loop through the array
If a number is greater than max, update it*/
public class BasicArray{
    public static void main(String[] args){
        int [] arr = {10, 34,45,65,23};

        int max = arr[0];

        for (int i = 0; i < arr.length;i++){
            if (arr[i] > max ){
                max = arr[i];
            }
        }

        System.out.println("Max Value in Array:" + max);
    }
}
