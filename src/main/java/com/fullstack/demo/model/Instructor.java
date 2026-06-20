package src.main.java.com.fullstack.demo.model;

public class Instructor {
    private String instructorId;
    private String instructorName;
    private String expertise;

    public Instructor(String instructorId, String instructorName, String expertise) {
        setInstructorId(instructorId);
        setInstructorName(instructorName);
        setExpertise(expertise);
    }

    // Getters
    public String getInstructorId() {
        return instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getExpertise() {
        return expertise;
    }

    // Setters with validation
    public void setInstructorId(String instructorId) {
        this.instructorId = requireText(instructorId, "Instructor ID");
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = requireText(instructorName, "Instructor Name");
    }

    public void setExpertise(String expertise) {
        this.expertise = requireText(expertise, "Expertise");
    }

    // Profile Output
    public void printProfile() {
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Name: " + instructorName);
        System.out.println("Expertise: " + expertise);
        System.out.println("----------------------------");
    }

    // Helper Validation Method
    private static String requireText(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " is required.");
        }
        return value.trim();
    }
}