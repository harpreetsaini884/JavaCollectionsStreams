package org.rituraj.regex.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "This is a damn bad example with some stupid words.";
        List<String> badWords = new ArrayList<>();

        badWords.add("damn");
        badWords.add("stupid");

        for(String b : badWords){
            text = text.replaceAll("\\b" + b + "\\b", "****");
        }

        System.out.println(text);

    }
}

