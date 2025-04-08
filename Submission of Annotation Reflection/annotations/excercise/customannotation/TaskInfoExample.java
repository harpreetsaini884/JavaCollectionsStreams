package org.rituraj.annotations.excercise.customannotation;
import java.lang.annotation.*;
import java.lang.reflect.*;
public class TaskInfoExample {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");
        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo task = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + task.priority() + ", Assigned To: " + task.assignedTo());
        }
    }
}