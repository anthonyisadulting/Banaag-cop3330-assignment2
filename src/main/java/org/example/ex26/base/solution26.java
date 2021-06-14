package org.example.ex26.base;
/*
*  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anthony Banaag
 */

 /*
    Exercise 26 - Months to Pay Off a Credit Card


Write a program that will help you determine how many months it will
take to pay off a credit card balance.
The program should ask the user to enter the balance of a credit card,
the APR of the card, and their
monthly payment. The program should then return the number of months
needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
Example Output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.
Constraints
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called
calculateMonthsUntilPaidOff, which returns the number of months.
Round fractions of a cent up to the next cent.

   */

import java.util.Scanner;

public class solution26 {

    public static String balance;
    public static String APR;
    public static String monthlypayment;


    public static Scanner in = new Scanner(System.in);




    public static void main(String[] args) {


        System.out.println("What is your balance?");
        balance = in.next();
        double bal = Double.parseDouble(balance);


        System.out.println("What is the APR on the card (as a percent)?");
        APR = in.next();
        double aprcard = Double.parseDouble(APR);

        System.out.println("What is the monthly payment you can make?");
        monthlypayment = in.next();
        double monthpay = Double.parseDouble(monthlypayment);


    PaymentCalculator one = new PaymentCalculator();






    System.out.println("It will take you " + one.calculateMonthsUntilPaidOff(bal,aprcard,monthpay) +" months to pay off this card.");


    }



}
