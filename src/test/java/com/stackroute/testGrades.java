package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class testGrades {
    static grades obj3;
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        obj3 = new grades();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        obj3 = null;

    }
    @Test
    public void test_grades(){
        assertArrayEquals("avg ,min ,max of grades"
                , new int[]{81,65,98}, obj3.check(4,new int[]{86,65,98,77}));
        assertNull("."
                ,  obj3.check(4,new int[]{86,65,102,105}));

        assertArrayEquals("."
                , new int[]{10,10,10}, obj3.check(5,new int[]{10,10,10,10,10}));


    }
}
