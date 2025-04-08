package org.rituraj.reflections.basic;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;
    public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(person, 30);
        System.out.println("Modified age: " + ageField.get(person));
    }
}