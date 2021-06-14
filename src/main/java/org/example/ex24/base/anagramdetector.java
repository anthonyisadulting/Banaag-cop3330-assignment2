package org.example.ex24.base;

import java.util.Arrays;

public class anagramdetector {

    static boolean isAnagram(String s1, String s2) {

        // length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // string to arrays (remember this synthax for future
        char string1ToArray[] = s1.toCharArray();
        char string2ToArray[] = s2.toCharArray();

        // sorting arrays by alhpabetical
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        for (int i = 0; i < s1.length(); i++) {
            if (string1ToArray[i] != string2ToArray[i]) {
                return false;
            }
        }
        return true;
    }
}
