package org.example.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Anthony Banaag
 */

/*
-in solution24 class:
    -put user input
    -return output (if need to check synthax)
     - anagram: a word that can be rearranged into something else

-in anagram detector put
 */


import java.util.Scanner;

import static org.example.ex24.base.anagramdetector.isAnagram;

public class solution24 {

    private static Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {


        System.out.println("Enter two strings and I'll tell you if they are anagrams");

        ReadInput();

        anagramdetector ad = new anagramdetector();



        if (isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are Anagrams");
        }
        else {
            System.out.println(word1 + " and " + word2 + " Not anagrams");
        }




    }


    public static void ReadInput(){


        System.out.println("Enter the first string:");
         word1 = in.next();

        System.out.println("Enter the second string:");
         word2 = in.next();

    }












}

