package org.rituraj.annotations.advanced.roleallowed;

class SecureService {
    @RoleAllowed("ADMIN")
    public void deleteData() {
        System.out.println("Data deleted by ADMIN");
    }
}
