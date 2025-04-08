package org.rituraj.annotations.excercise.repeatableannotation;

import java.lang.reflect.Method;

public class BugReportExample {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("buggyMethod");
        BugReport[] bugs = method.getAnnotationsByType(BugReport.class);
        for (BugReport bug : bugs) {
            System.out.println("Bug: " + bug.description());
        }
    }
}