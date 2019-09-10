package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPalindrome {
    private static palindrome obj1;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj1 = new palindrome();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj1 = null;

    }

    @Test
    public void test_palindrome(){
        assertEquals("Java method to Reverse the given input & Check if it is a Palindrome."
                , 1, obj1.check(1221));
        assertEquals("Java method to Reverse the given input & Check if it is a Palindrome."
                , 1, obj1.check(24566542));
        assertEquals("Java method to Reverse the given input & Check if it is a Palindrome."
                , -1, obj1.check(24566));

    }

}
