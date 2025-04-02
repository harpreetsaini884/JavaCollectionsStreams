package org.rituraj.regex.basic;

import java.util.Scanner;

public class ReplaceAndModifyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "This is              an          example     with        multiple     spaces.";

        String regex = "\\s+";
        text = text.replaceAll(regex, " ");

        System.out.println(text);

    }
}

