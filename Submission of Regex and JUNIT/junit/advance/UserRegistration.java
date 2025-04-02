package org.rituraj.junit.advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public String register(String userName, String email, String password){
        String userRegex = "^[A-Za-z\\d_]{4,}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        String emailRegex = "^[a-z0-9.+-]+@[a-z0-9.+-]+\\.[a-z.]{2,}$";

        // Validate usernam
        if (!Pattern.matches(userRegex, userName)) {
            throw new IllegalArgumentException("Invalid username! Username must be at least 4 characters long and can contain letters, numbers, dots, and underscores.");
        }

        // Validate email
        if (!Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("Invalid email! Please provide a valid email address.");
        }

        // Validate password
        if (!Pattern.matches(passwordRegex, password)) {
            throw new IllegalArgumentException("Invalid password! Password must be at least 8 characters long, with one uppercase letter, one lowercase letter, one digit, and one special character.");
        }

        // If all validations pass
        return "User registered successfully!";
    }
}
