package org.rituraj.annotations.intermediate.maxlength;

public class MaxLengthExample {
    public static void main(String[] args) {
        try {
            new User("LongUsername");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
