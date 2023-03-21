package com.softserve.edu;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Unit test for CheckEmail.
 */

@RunWith(value = Parameterized.class)
public class App4Test {
    private String email;
    private boolean expectedResult;
    private String message;

    public App4Test(String email, boolean expectedResult, String message) {
        this.email = email;
        this.expectedResult = expectedResult;
        this.message = message;
        System.out.println("\t\t " + message);
    }

    //parametrized tests
     @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"", false, "\t\tEmpty email()"},
                {"mm@m.ua", true, "\t\tEmail in low register()"},
                {"MM@M.UA", true, "\t\tEmail in high register()"},
                {"m1@m.ua", true, "\t\tEmail with digits()"},
                {"1@m.ua", false, "\t\tEmail with digits at the beginning()"},
                {"m1@m1.ua", true, "\t\tEmail with digits at domain()"},
                {"m1@m!1.ua", false, "\t\tEmail with special chars at domain()"},
                {"m1@m_1.ua", false, "\t\tEmail with _ at domain()"},
                {"m 1@m_1.ua", false, "\t\tEmail with spaces()"},
                {"m.m@m.ua", true, "\t\tEmail with dots()"},
                {"m..m@m.ua", false, "\t\tEmail with double dots()"},
                {"m.m@m.m.ua", true, "\t\tEmail with several domains()"},
                {"m.m@ua", false, "\t\tEmail without dots at domain()"},
                {"m.mua", false, "\t\tEmail without @"},
                {"m@m@ua", false, "\t\tEmail with several @"},
                {"m@m@ua", false, "\t\tEmail with several @"},
                {"@ua.ua", false, "\t\tEmail without name()"},
                {"m1@", false, "\t\tEmail without domain()"},
                {"m1@m1.y", false, "\t\tIncorrect top domain()"},
                {"m!1@m.ua", false, "\t\tEmail with special chars()"},
                {"m_1@m1.ua", false, "\t\tEmail with _()"},
                {"1m@m.ua", false, "\t\tUsername starting with digit ()"},
        };
        return Arrays.asList(data);
    }


    @Test
    public void pushTest() {
        Assert.assertEquals(expectedResult, App.CheckEmail(email));
        System.out.println("Expected result=" + expectedResult);
        System.out.println("Actual result=" + App.CheckEmail(email)+"\n");
    }
}
