package org.rituraj.annotations.intermediate.logexecutiontime;

public class Performance {
    class Performance {
        @LogExecutionTime
        public void process() {
            long start = System.nanoTime();
            for (int i = 0; i < 1000000; i++);
            long end = System.nanoTime();
            System.out.println("Execution Time: " + (end - start) + " ns");
        }
    }
}
