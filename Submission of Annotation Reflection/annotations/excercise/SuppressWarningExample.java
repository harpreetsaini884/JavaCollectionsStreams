package org.rituraj.annotations.excercise;

import java.util.*;

public class SuppressWarningExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // No generics
        list.add("Unchecked Warning Suppressed");
        System.out.println(list.get(0));
    }
}