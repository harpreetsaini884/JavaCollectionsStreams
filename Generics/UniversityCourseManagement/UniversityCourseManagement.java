package UniversityCourseManagement;
import java.util.*;

// Abstract class representing a Course Type
abstract class CourseType {
    private String type;

    CourseType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Specific Course Types
class ExamCourse extends CourseType {
    ExamCourse() {
        super("Exam-Based");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() {
        super("Assignment-Based");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse() {
        super("Research-Based");
    }
}

// Generic Course class
class Course<T extends CourseType> {
    private String name;
    private String department;
    private T courseType;

    Course(String name, String department, T courseType) {
        this.name = name;
        this.department = department;
        this.courseType = courseType;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public T getCourseType() {
        return courseType;
    }

    public String toString() {
        return "Course Name: " + name + " | Department: " + department + " | Course Type: " + courseType.getType();
    }
}

// Course Management System
class CourseManagement {
    List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<?> course : courses) {
            System.out.println(course);
        }
    }
}

// Main class
public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> mathExam = new Course<>("Mathematics", "Science", new ExamCourse());
        Course<AssignmentCourse> historyCourse = new Course<>("History", "Arts", new AssignmentCourse());
        Course<ResearchCourse> physicsResearch = new Course<>("Quantum Physics", "Science", new ResearchCourse());

        // Course management system
        CourseManagement cms = new CourseManagement();
        cms.addCourse(mathExam);
        cms.addCourse(historyCourse);
        cms.addCourse(physicsResearch);

        // Display courses
        System.out.println("University Course Catalog:");
        cms.displayCourses();
    }
}
