package org.rituraj.reflections.intermediate;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodCall {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add, subtract, multiply): ");
        String methodName = scanner.nextLine();

        MathOperations math = new MathOperations();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.println("Result: " + method.invoke(math, 10, 5));
    }


}

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}
