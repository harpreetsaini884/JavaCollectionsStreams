package org.rituraj.regex.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCards {
    public static void main(String[] args) {
        String ip = "4123659874589632";

        String regex = "^(4[0-9]{15}|5[0-9]{15}$)";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);

        while(matcher.find()){
            System.out.println("Found: " + matcher.group());
        }
    }
}
