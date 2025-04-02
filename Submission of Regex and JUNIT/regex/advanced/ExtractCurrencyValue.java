package org.rituraj.regex.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValue {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        String regex = "\\$?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}
