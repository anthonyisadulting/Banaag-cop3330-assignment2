package org.example.ex30base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anthony Banaag
 */

public class solution30 {

    public static void main(String[] args) {

        int max = 12;

        multytable(max);

    }

    public static void multytable(int max) {

        for(int i = 1; i<=max;i++ ) {


            System.out.format("%4d",i);

        }

        System.out.println();


        for(int i = 1 ;i<=max;i++) {

            for(int i0=1;i0<=max;i0++) {
                System.out.format("%4d",i*i0);


            }


            System.out.println();
        }
    }

}