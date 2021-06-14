package org.example.ex33base;

import java.util.Scanner;

public class solution33 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What's your question?");
        String question = in.next();
        randomgenerator(question);

    }

    public static void randomgenerator(String question){
        int randomnumber = 1 + (int)(3*Math.random());

        String y = "Yes";
        String n = "No";
        String ml = "Maybe later";

        if(randomnumber == 1){
            System.out.println(y);
        }
        else if(randomnumber == 2){
            System.out.println(n);
        }
        else if(randomnumber == 3){
            System.out.println(ml);

        }
        else{
            System.out.println("Please exit and try again");
        }

    }

}
