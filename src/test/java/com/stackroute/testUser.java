package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testUser {
    static user obj5;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj5 = new user("korada", "ganesh", 21, 500);

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj5 = null;

    }
    @Test
    public void test_user(){
        assertEquals("Java method to find valid age."
                , true, obj5.isvalidage());
        assertEquals("Java method to check full name"
                , "korada ganesh", obj5.getFullName());
    }
}
