package org.rituraj.annotations.basic.todo;

public class Project {
    @Todo(task = "Implement login feature", assignedTo = "Alice", priority = "HIGH")
    public void login() {}

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDB() {}
}
