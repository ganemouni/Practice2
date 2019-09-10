package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class testfactorial {
    private static factorial obj7;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj7 = new factorial();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj7 = null;

    }

    @Test
    public void test_factorial(){
        assertEquals("to check factorial"
                , 479001600, obj7.fact(12));
        assertEquals("to check factorial"
                , -1, obj7.fact(13));
        assertEquals("to check factorial"
                , -1, obj7.longfact(25));
        assertNotEquals(622702000,obj7.fact(13) );


    }
}
