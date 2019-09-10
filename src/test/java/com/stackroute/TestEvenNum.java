package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEvenNum {
    static EvenNumTest obj2;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj2 = new EvenNumTest();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj2 = null;

    }
    @Test
    public void test_even(){
        assertEquals(" Given obj is even"
                , true, obj2.isEven(2));
        assertEquals("number is not even"
                , false, obj2.isEven(143));
        assertEquals("number is not even"
                , false, obj2.isEven(5));

    }
}
