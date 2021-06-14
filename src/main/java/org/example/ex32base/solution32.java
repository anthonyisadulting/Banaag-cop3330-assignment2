package org.example.ex32base;

import java.sql.SQLOutput;
import java.util.Scanner;

public class solution32 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!");
        System.out.println("\n");


        switch (difficultylevel()) {
            case "1" -> game1();
            case "2" -> game2();
            case "3" -> game3();
        }

    }

    private static void mainrecall() {
        System.out.println("Let's play Guess the Number!");
        System.out.println("\n");


        switch (difficultylevel()) {
            case "1" -> game1();
            case "2" -> game2();
            case "3" -> game3();
        }

    }

    public static String difficultylevel(){
        System.out.println("Enter the difficulty level (1,2,3):");


        return in.next();
    }

    public static void game1(){

        int i;

        int randomnumber = 1 + (int)(10*Math.random());

        System.out.println("I have my number. What's your guess?");

        for(i=0; i < 999; i++) {
            String answer = in.next();
            int numanswer = Integer.parseInt(answer);

            if (numanswer != randomnumber) {

                if (numanswer < randomnumber) {
                    System.out.println("Too low. Guess again:");
                }

                if (numanswer > randomnumber) {
                    System.out.println("Too high. Guess again:");
                }

            } else {

                System.out.println("You got it!");
                System.out.println("Do you wish to play again(Y/N?)");
                String yesorno = in.next();

                if(yesorno.equals("Y")){

                    mainrecall();
                }
                else if(yesorno.equals("N")){
                    break;
                }

            }
        }




    }



    public static void game2(){

        int i;

        int randomnumber = 1 + (int)(100*Math.random());

        System.out.println("I have my number. What's your guess?");


        for(i=0; i < 999; i++) {
            String answer = in.next();
            int numanswer = Integer.parseInt(answer);

            if (numanswer != randomnumber) {

                if (numanswer < randomnumber) {
                    System.out.println("Too low. Guess again:");
                }

                if (numanswer > randomnumber) {
                    System.out.println("Too high. Guess again:");
                }

            } else {

                System.out.println("You got it!");
                System.out.println("Do you wish to play again(Y/N?)");
                String yesorno = in.next();

                if(yesorno.equals("Y")){

                    mainrecall();
                }
                else if(yesorno.equals("N")){
                    break;
                }

            }
        }









    }

    public static void game3(){
        int i;

        int randomnumber = 1 + (int)(1000*Math.random());

        System.out.println("I have my number. What's your guess?");

        for(i=0; i < 999; i++) {
            String answer = in.next();
            int numanswer = Integer.parseInt(answer);

            if (numanswer != randomnumber) {

                if (numanswer < randomnumber) {
                    System.out.println("Too low. Guess again:");
                }

                if (numanswer > randomnumber) {
                    System.out.println("Too high. Guess again:");
                }

            } else {

                System.out.println("You got it!");
                System.out.println("Do you wish to play again(Y/N?)");
                String yesorno = in.next();

                if(yesorno.equals("Y")){

                    mainrecall();
                }
                else if(yesorno.equals("N")){
                    break;
                }

            }
        }




    }

}
