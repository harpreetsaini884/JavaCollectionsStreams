package org.rituraj.regex.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String ip = "123.123.211.201";

        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\."
                + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);

        while(matcher.find()){
            System.out.println("Found: " + matcher.group());
        }
    }
}
