package org.rituraj.annotations.intermediate.logexecutiontime;

import java.lang.reflect.Method;

public class ExecutionTimeExample {
    public static void main(String[] args) throws Exception {
        Method method = Performance.class.getMethod("process");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            method.invoke(new Performance());
        }
    }
}