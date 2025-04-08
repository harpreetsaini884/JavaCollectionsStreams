package org.rituraj.reflections.basic;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;
public class PrivateMethodInvoke {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calculator, 5, 4);
        System.out.println("Result: " + result);
    }
}