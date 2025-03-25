import java.util.*;

// Abstract class representing a Job Role
abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

// Specific job roles extending JobRole
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

// Generic Resume class to process resumes dynamically
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    private int experienceYears; // Experience in years

    public Resume(String candidateName, T jobRole, int experienceYears) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.experienceYears = experienceYears;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Candidate: " + candidateName + " | Job Role: " + jobRole.getRoleName() + " | Experience: " + experienceYears + " years";
    }
}

// Resume Screening System
class ResumeScreening {
    private List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

    // Method to add resumes dynamically
    public <T extends JobRole> void addResume(Resume<T> resume) {
        resumeList.add(resume);
    }

    // Method to display all screened resumes
    public void displayScreenedResumes() {
        System.out.println("Screened Resumes:");
        for (Resume<?> resume : resumeList) {
            System.out.println(resume);
        }
    }
}

// Main Class to Demonstrate the AI Resume Screening System
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Creating different resumes
        Resume<SoftwareEngineer> seResume = new Resume<>("Alice Johnson", new SoftwareEngineer(), 5);
        Resume<DataScientist> dsResume = new Resume<>("Bob Smith", new DataScientist(), 3);
        Resume<ProductManager> pmResume = new Resume<>("Charlie Brown", new ProductManager(), 7);

        // Creating Resume Screening System
        ResumeScreening screeningSystem = new ResumeScreening();
        screeningSystem.addResume(seResume);
        screeningSystem.addResume(dsResume);
        screeningSystem.addResume(pmResume);

        // Display all screened resumes
        screeningSystem.displayScreenedResumes();
    }
}
