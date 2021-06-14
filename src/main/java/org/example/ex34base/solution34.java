package org.example.ex34base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anthony Banaag
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class solution34 {


    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");


        System.out.println("There are 5 employees");
        for(String names:list)
        System.out.println(names);

        System.out.println("Enter an employee name to remove:");
        String removal = in.next();

        switch (removal) {
            case "John Smith" -> {
                list.remove("John Smith");
                System.out.println("There are 4 employees");
                for (String names : list)
                    System.out.println(names);
            }
            case "Jackie Jackson" -> {
                list.remove("Jackie Jackson");
                System.out.println("There are 4 employees");
                for (String names : list)
                    System.out.println(names);
            }
            case "Chris Jones" -> {
                list.remove("Chris Jones");
                System.out.println("There are 4 employees");
                for (String names : list)
                    System.out.println(names);
            }
            case "Amanda Cullen" -> {
                list.remove("Amanda Cullen");
                System.out.println("There are 4 employees");
                for (String names : list)
                    System.out.println(names);
            }
            case "Jeremy Goodwin" -> {
                list.remove("Jeremy Goodwin");
                System.out.println("There are 4 employees");
                for (String names : list)
                    System.out.println(names);
            }
        }



    }




}
