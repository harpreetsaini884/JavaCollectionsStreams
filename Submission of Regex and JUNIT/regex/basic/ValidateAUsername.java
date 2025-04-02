package org.rituraj.regex.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();

        String regex = "(?=[a-zA-Z])[a-zA-Z0-9_]{5,15}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userName);


        System.out.println( (matcher.matches()) ? "Valid" : "Invalid");

    }
}
