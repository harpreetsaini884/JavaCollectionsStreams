package org.rituraj.annotations.excercise.customannotation;

public class TaskManager {
        @TaskInfo(priority = "High", assignedTo = "John")
        public void completeTask() {
            System.out.println("Task completed");
        }

}
