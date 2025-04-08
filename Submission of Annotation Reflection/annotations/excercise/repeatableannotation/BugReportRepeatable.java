package org.rituraj.annotations.excercise.repeatableannotation;


import java.lang.annotation.*;
import java.lang.reflect.*;
@Repeatable(BugReports.class)
@interface BugReportRepeatable {
    String description();
}
