package org.rituraj.regex.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}

