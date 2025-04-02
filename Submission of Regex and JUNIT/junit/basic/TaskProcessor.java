package org.rituraj.junit.basic;

public class TaskProcessor{
    public String stimulateTask() throws InterruptedException{
        Thread.sleep(3000);
        return "Task complete";
    }
}
