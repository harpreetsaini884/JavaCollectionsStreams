package org.rituraj.junit.advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public boolean checkPassword(String text){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()) {
            System.out.println(matcher.group());
            return true;
        }

        return false;
    }
}
