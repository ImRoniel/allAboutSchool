package com.DSA.roniel;

public class Student {
    int rollNumber;
    String studentName;
    Student next;

    public Student(int rollNumber,String studentName){
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.next = null;
    }


}
//THESE ARE THE OUTPUT
/*1. roniel(rollno: 101) - present*/
/*1. reniel(rollno: 102) - absent*/
