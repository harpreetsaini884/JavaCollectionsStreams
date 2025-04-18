package org.rituraj.regex.advanced;

import java.util.regex.*;
import java.util.HashSet;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String sentence = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\b(?:\\s+\\1)+";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }

        System.out.println("Repeated Words: " + repeatedWords);
    }
}

