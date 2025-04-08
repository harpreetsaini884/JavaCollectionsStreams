package org.rituraj.reflections.advanced;

import java.lang.reflect.Field;

public class DIContainer {
    public static void injectDependencies(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, field.getType().getDeclaredConstructor().newInstance());
            }
        }
    }
}

@interface Inject {}
class Service {}
class Client {
    @Inject Service service;
}
