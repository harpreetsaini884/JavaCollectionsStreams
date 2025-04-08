package org.rituraj.annotations.basic.importantmethod;

import java.lang.reflect.Method;

class AnnotationProcessor {
    public static void main(String[] args) {
        System.out.println("Processing @ImportantMethod Annotations:");
        Class<?> clazz = SampleClass.class;
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
            }
        }
    }
}
