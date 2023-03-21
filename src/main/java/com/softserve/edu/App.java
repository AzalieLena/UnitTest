package com.softserve.edu;

import java.util.regex.*;
import static java.lang.System.out;

public class App {

    public static boolean CheckEmail(String text) {
        String pattern = "^[A-Za-z]+[A-Za-z0-9]*(\\.[A-Za-z0-9]+)*@([A-Za-z0-9]+\\.)+[A-Za-z]{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m =  p.matcher(text);
        return (m.find());
    }
        public static void main(String[] args) {
        String s = "";
        boolean res = CheckEmail(s);
        out.print(res);
    }
}
