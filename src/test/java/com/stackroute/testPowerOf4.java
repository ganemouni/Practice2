package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPowerOf4 {
    private static powerOf4 obj2;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj2 = new powerOf4();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj2 = null;

    }
    @Test
    public void test_powerof4(){
        assertEquals("Java method to check if a given number is power of 4"
                , 1, obj2.check(256));
        assertEquals("Java method to check if a given number is power of 4"
                , -1, obj2.check(100));
        assertEquals("Java method to check if a given number is power of 4."
                , 1, obj2.check(1));

    }
}
