package org.rituraj.regex.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        String regex = "\\b[0-9]{2}/[0-9]{2}/[0-9]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}


