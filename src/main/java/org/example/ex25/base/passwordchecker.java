package org.example.ex25.base;

import java.util.Arrays;

public class passwordchecker {

    public static void main(String[] args) {
        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        char[] specialsymbols ={'!', '@', '#', '$', '%', '^', '&',
                '*', '(', ')', '-', '+'};

    }

     static boolean lengthchecker(String password){

        if(password.length() >= 8){
            return true;
        }
            else{
                return false;
        }

    }

    static boolean stringchecker(String password){
        if(password.matches("([A-Z]).*[a-z]")){
        return false;
        }
        else{
            return true;
        }
    }





}
