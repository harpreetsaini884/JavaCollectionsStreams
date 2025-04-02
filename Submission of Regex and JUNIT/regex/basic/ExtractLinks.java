package org.rituraj.regex.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "http[s]?://www\\.[a-z.]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}

