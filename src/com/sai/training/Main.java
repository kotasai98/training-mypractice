package com.sai.training;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("a:");
        a = sc.nextInt();
        System.out.println("b:");
        b = sc.nextInt();
        System.out.println("c:");
        c = sc.nextInt();
        int sum = a + b + c;
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
            System.out.println("c is odd number");}}}