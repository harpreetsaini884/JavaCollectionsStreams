package org.rituraj.reflections.advanced;

import java.lang.reflect.Method;

public class MethodTiming {
    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}
