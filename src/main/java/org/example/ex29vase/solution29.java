package org.example.ex29vase;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anthony Banaag
 */

public class solution29 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
        System.out.println("What is the rate of return?");
        String rate = in.next();


        if(rate.equals("0")){
            System.out.println("Sorry. That is not a valid input.");
        }
        if(rate.matches("[a-zA-Z]+")){
            System.out.println("Sorry. That is not a valid input.");
        }
        else {
            int actualrate = Integer.parseInt(rate);

            int formula = 72 / actualrate;

            System.out.println("It will take " + formula + " years to double your initial investment.");
            break;
        }

    }



    }
}
