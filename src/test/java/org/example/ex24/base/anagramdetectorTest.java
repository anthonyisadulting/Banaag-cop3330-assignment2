package org.example.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramdetectorTest {

    @Test
    void isAnagram_returns_the_right_answer() {

        anagramdetector detector = new anagramdetector();

        boolean actual = detector.isAnagram("difo", "fido");

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams(){
        anagramdetector detector = new anagramdetector();

        boolean actual = detector.isAnagram("difo", "god");
        boolean expected = false;

        assertFalse(actual);



    }

    @Test
    void isAnagram_returns_the_right_answer_for_other_anagrams0() {

        anagramdetector detector = new anagramdetector();

        boolean actual = detector.isAnagram("note", "tone");

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_the_right_answer_for_other_anagrams1() {

        anagramdetector detector = new anagramdetector();

        boolean actual = detector.isAnagram("silent", "listen");

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_the_right_answer_for_other_anagrams2() {

        anagramdetector detector = new anagramdetector();

        boolean actual = detector.isAnagram("racecar", "carrace");

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_the_right_answer_for_other_anagrams3() {

        anagramdetector detector = new anagramdetector();

        boolean actual = detector.isAnagram("yuh", "lmao");

        assertFalse(actual);
    }


}