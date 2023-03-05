package com.sai.training;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a; int b; int c;
        System.out.print("a:");
        a = sc.nextInt();
        System.out.print("b:");
        b = sc.nextInt();
        System.out.print("c:");
        c = sc.nextInt();
        int sum = a + b + c;
        int product = a*b*c;
        System.out.println("sum of all numbers is :" + sum);
        //if the numbers are even
        if ((a % 2 == 0)) {
            System.out.println("a is even number");
        } else {
            System.out.println("a is odd number");
        }
     if ((b % 2 == 0)) {
        System.out.println("b is even number");
        } else {
        System.out.println("b is odd number");}
        if ((c % 2 == 0)) {
            System.out.println("c is even number");
        } else {
            System.out.println("c is odd number");}
//which is larger number
if (a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }else {
    System.out.println("c is largest");

//multiplication of numbers
    System.out.println("product of numbers :" + product);
    //example
    System.out.println("a/b");
}}}