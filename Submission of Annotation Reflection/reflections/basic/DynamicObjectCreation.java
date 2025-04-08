package org.rituraj.reflections.basic;

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");
        Object obj = clazz.getDeclaredConstructor().newInstance();
    }
}

class Student {
    public Student() {
        System.out.println("Student instance created");
    }
}
