package org.rituraj.reflections.advanced;

import java.lang.reflect.Field;

public class JsonMapper {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"" + field.getName() + "\":\"" + field.get(obj) + "\", ");
        }
        return json.substring(0, json.length() - 2) + "}";
    }
}
