package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testMember {
    private static member obj1;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj1 = new member("Harry potter",30,2500.3f);

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj1 = null;

    }
    @Test
    public void test_member(){
        assertEquals("checking member variables of object"
                , 30, obj1.getage());
        assertEquals("checking member variables of object"
                , "Harry potter", obj1.getname());
        assertEquals("checking member variables of object"
                , 2500, obj1.getSalary());

    }
}
