package org.rituraj.annotations.advanced.jsonfield;

import java.lang.reflect.Field;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonSerializer {
    public static String serialize(Object obj) throws IllegalAccessException {
        Map<String, Object> jsonMap = new HashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), field.get(obj));
            }
        }
        try {
            return new ObjectMapper().writeValueAsString(jsonMap);
        } catch (Exception e) {
            return "{}";
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("John Doe", 30);
        System.out.println("Serialized JSON: " + serialize(user));
    }
}
