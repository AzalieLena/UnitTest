package com.softserve.edu;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for CheckEmail.
 */

//non parametrized tests, NullPointerException

public class App3Test {
    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        System.out.println("\t\tNullPointerException(), no arguments");
        boolean actual = App.CheckEmail(null);
        boolean expected = false;
        Assert.assertEquals(expected, actual);
    }
}

