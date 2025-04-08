package org.rituraj.annotations.advanced.roleallowed;

import java.lang.reflect.Method;

public class RoleBasedAccessExample {
    public static void main(String[] args) throws Exception {
        String currentRole = "USER";
        Method method = SecureService.class.getMethod("deleteData");
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed role = method.getAnnotation(RoleAllowed.class);
            if (role.value().equals(currentRole)) {
                method.invoke(new SecureService());
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}

