package src.main.java.com.fullstack.demo.model;

public class Course {
    private String courseId;
    private String title;
    private int durationHours;
    private String level;
    //private String category;
    //private boolean active;
    private Instructor instructor;
    
    public Course(String courseId, String title, int durationHours, String level) {
        setCourseId(courseId);
        setTitle(title);
        setDurationHours(durationHours);
        setLevel(level);
    //    setCategory(category);
    //    setActive(active);
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public String getLevel() {
        return level;
    }

    // public String getCategory() {
    //     return category;
    // }

    // public boolean isActive() {
    //     return active;
    // }

    public Instructor getInstructor() {
        return instructor;
    }
    
    // Setters with validation
    public void setCourseId(String courseId) {
        this.courseId = requireText(courseId, "Course ID");
    }

    public void setTitle(String title) {
        this.title = requireText(title, "Title");
    }

    public void setDurationHours(int durationHours) {
        if (durationHours <= 0) {
            throw new IllegalArgumentException("Duration must be more than 0.");
        }
        this.durationHours = durationHours;
    }

    public void setLevel(String level) {
        this.level = requireText(level, "Course Level");
    }

    // public void setCategory(String category) {
    //     this.category = requireText(category, "Category");
    // }

    // public void setActive(boolean active) {
    //     this.active = active;
    // }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Summary Output
    public void printSummary() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + durationHours + " hours");
        System.out.println("Level: " + level);
    //    System.out.println("Category: " + category);
    //    System.out.println("Status: " + (active ? "Active" : "Inactive"));
        
        if (instructor == null) {
            System.out.println("Instructor: Not assigned yet");
        } else {
            System.out.println("Instructor: " + instructor.getInstructorName());
        }
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