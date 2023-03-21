package com.softserve.edu;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for CheckEmail.
 */
public class AppTest {

    @Test(expected=NullPointerException.class)
    public void testNullPointerException() {
        System.out.println("\t\tNullPointerException(), no arguments");
        boolean actual = App.CheckEmail(null);
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp1() {
        System.out.println("\t\tEmpty email()");
        boolean actual = App.CheckEmail("");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

   @Test
   public void testApp2() {
       System.out.println("\t\tEmail in low register()");
       boolean actual = App.CheckEmail("mm@m.ua");
       boolean expected = true;
       Assert.assertEquals(expected,actual);
   }

    @Test
    public void testApp3() {
        System.out.println("\t\tEmail in high register()");
        boolean actual = App.CheckEmail("MM@M.UA");
        boolean expected = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp4() {
        System.out.println("\t\tEmail with digits()");
        boolean actual = App.CheckEmail("m1@m.ua");
        boolean expected = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp5() {
        System.out.println("\t\tEmail with digits at the beginning()");
        boolean actual = App.CheckEmail("1@m.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp6() {
        System.out.println("\t\tEmail with digits at domain()");
        boolean actual = App.CheckEmail("m1@m1.ua");
        boolean expected = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp7() {
        System.out.println("\t\tEmail with special chars at domain()");
        boolean actual = App.CheckEmail("m1@m!1.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp8() {
        System.out.println("\t\tEmail with _ at domain()");
        boolean actual = App.CheckEmail("m1@m_1.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testApp9() {
        System.out.println("\t\tEmail with spaces ()");
        boolean actual = App.CheckEmail("m 1@m_1.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp10() {
        System.out.println("\t\tEmail with dots()");
        boolean actual = App.CheckEmail("m.m@m.ua");
        boolean expected = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp11() {
        System.out.println("\t\tEmail with double dots()");
        boolean actual = App.CheckEmail("m..m@m.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp12() {
        System.out.println("\t\tEmail with several domains()");
        boolean actual = App.CheckEmail("m.m@m.m.ua");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testApp13() {
        System.out.println("\t\tEmail without dots at domain()");
        boolean actual = App.CheckEmail("m.m@ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp14() {
        System.out.println("\t\tEmail without @()");
        boolean actual = App.CheckEmail("m.mua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp15() {
        System.out.println("\t\tEmail with several @()");
        boolean actual = App.CheckEmail("m@m@ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp16() {
        System.out.println("\t\tEmail without name()");
        boolean actual = App.CheckEmail("@ua.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp17() {
        System.out.println("\t\tEmail without domain()");
        boolean actual = App.CheckEmail("m1@");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp18() {
        System.out.println("\t\tIncorrect top domain()");
        boolean actual = App.CheckEmail("m1@m1.y");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp19() {
        System.out.println("\t\tEmail with special chars()");
        boolean actual = App.CheckEmail("m!@m!.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp20() {
        System.out.println("\t\tEmail with _()");
        boolean actual = App.CheckEmail("m_1@m1.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testApp21() {
        System.out.println("\t\tUsername starting with digit ()");
        boolean actual = App.CheckEmail("1m@m.ua");
        boolean expected = false;
        Assert.assertEquals(expected,actual);
    }
 }
