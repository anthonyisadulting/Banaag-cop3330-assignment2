package org.example.ex27base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anthony Banaag
 */

import java.util.Scanner;

public class solution27 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the first name:");
        String firstname = in.next();

        namevalidator(firstname);

        System.out.println("Enter the last name:");
        String lastname = in.next();

        namevalidator(lastname);

        System.out.println("Enter the ZIP code:");
        String zipcode= in.next();

        zipchecker(zipcode);

        System.out.println("Enter the Employee ID:");
        String employeeid= in.next();

        idchecker(employeeid);


    }

    public static void namevalidator(String firstname){

        if(firstname.length() <2){
            System.out.println("The first name must be at least 2 characters long");
        }
        else{
            System.out.println("it works");
        }

    }

    public static void zipchecker(String zipcode){

         if ( zipcode.matches("[0-9]{5}")){
             System.out.println("It works!");
        }
        else{
             System.out.println("The zipcode must be a 5 digit number.");
         }

    }

    public static void idchecker(String employeeid){
        for (int i =0; i <= employeeid.length(); i++) {
            //if ((employeeid.substring(0,1)).matches("^[a-z,A-Z]*$") && (employeeid.charAt(2) != '-') && (employeeid.substring(3,6).matches("[0-9]"))) {

             //       System.out.print("works");
            //    }
            //else {System.out.println("not works");}
            //    }

            char id = employeeid.charAt(i);
            System.out.println(id + "");
            } } }


