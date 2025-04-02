package org.rituraj.junit.basic;

public class DatabaseConnection {
    private boolean isConnected = false;

    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Database connected.");
        }
    }

    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Database disconnected.");
        }
    }

    public boolean isConnected() {
        return isConnected;
    }
}

