package org.rituraj.reflections.intermediate;

import java.lang.module.Configuration;
import java.lang.reflect.Field;

public class ModifyStaticField {
    private static String API_KEY = "12345";
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "67890");
        System.out.println("Modified API_KEY: " + field.get(null));
    }
}


