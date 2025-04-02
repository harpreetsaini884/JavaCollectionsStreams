package org.rituraj.regex.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSNNumber {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";

        String regex = "[\\d]{3}-[\\d]{2}-[\\d]{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Found: " + matcher.group());
        }
    }
}
