package org.rituraj.annotations.basic.importantmethod;

class SampleClass {
    @ImportantMethod(level = "CRITICAL")
    public void criticalMethod() {
        System.out.println("Executing Critical Method...");
    }

    @ImportantMethod
    public void defaultImportantMethod() {
        System.out.println("Executing Default Important Method...");
    }

    public void normalMethod() {
        System.out.println("Executing Normal Method...");
    }
}
