package org.example.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordcheckerTest {

    @Test

    void is_stringchecker_working_false(){
        passwordchecker stringchecker01 = new passwordchecker();

        boolean actual = stringchecker01.stringchecker("123456");

        assertFalse(actual);



    }
    @Test
    void isstringcheckerworkingtrue(){
        passwordchecker stringchecker01 = new passwordchecker();

        boolean actual = stringchecker01.stringchecker("123");

        assertTrue(actual);



    }




}