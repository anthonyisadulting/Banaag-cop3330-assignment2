package org.example.ex28base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anthony Banaag
 */


import java.util.Scanner;

//insert flowchart here
public class solution28 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 0; i<5; i++){
            System.out.println("Enter a Number:");
            String number0 = in.next();
            int numbers = Integer.parseInt(number0);
            sum +=numbers;

        }
        System.out.println("The total is " + sum);

    }
}
