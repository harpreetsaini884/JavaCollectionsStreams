package org.rituraj.regex.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Contact us at support@example.com and info@company.org.in.edu";

        String regex = "[a-z0-9.+-]+@[a-z0-9.+-]+\\.[a-z.]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}
