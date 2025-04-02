package org.rituraj.regex.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractName {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Java", "Python", "JavaScript", "Go");

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        for(String n : name){
            String regex = "\\b" + n + "\\b";
            Matcher matcher = Pattern.compile(regex).matcher(text);
            if(matcher.find()){
                System.out.println("Found: " + matcher.group());
            }
        }

    }
}
