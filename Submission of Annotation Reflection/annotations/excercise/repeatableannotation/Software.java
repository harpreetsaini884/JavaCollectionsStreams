package org.rituraj.annotations.excercise.repeatableannotation;

class Software {
    @BugReport(description = "Fix null pointer exception")
    @BugReport(description = "Optimize algorithm performance")
    public void buggyMethod() {}
}
