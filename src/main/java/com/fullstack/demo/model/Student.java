package src.main.java.com.fullstack.demo.model;

public class Student {
    private String studentId;
    private String studentName;
    private String email;

    public Student(String studentId, String studentName, String email) {
        setStudentId(studentId);
        setStudentName(studentName);
        setEmail(email);
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }

    // Setters with validation
    public void setStudentId(String studentId) {
        this.studentId = requireText(studentId, "Student ID");
    }

    public void setStudentName(String studentName) {
        this.studentName = requireText(studentName, "Student Name");
    }

    public void setEmail(String email) {
        this.email = requireText(email, "Email");
    }

    // Profile Output
    public void printProfile() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Email: " + email);
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