package src.main.java.com.fullstack.demo;
import src.main.java.com.fullstack.demo.model.Course;
import src.main.java.com.fullstack.demo.model.CourseOffering;
import src.main.java.com.fullstack.demo.model.Instructor;
import src.main.java.com.fullstack.demo.model.Student;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("I001", "James Bond", "Artificial Intelligence");
        Instructor instructor2 = new Instructor("I002", "Benoit Blanc", "Cybersecurity");
        
        Course course1 = new Course("CS001", "Introduction to Computer Science", 40, "Beginner", "Fullstack Programming", true);
        Course course2 = new Course("CS002", "React Frontend Development", 21, "Intermediate", "Frontend Developmenet", false);

        Student student1 = new Student("S001", "Charlie Brown", "cFq0l@example.com");
        Student student2 = new Student("S002", "Daisy Duck", "d4oQG@example.com");
        
        //CourseOffering co1 = new CourseOffering("OFF001", "Java Fundamentals - June 2026 Intake", course1, instructor1, "2026-06-19", "2026-06-20", 25, "Physical");
        //CourseOffering co2 = new CourseOffering("OFF002", "React Framework - June 2026 Intake", course2, instructor2, "2026-07-19", "2026-07-20", 21, "Hybrid");

        course1.setInstructor(instructor1);
        course2.setInstructor(instructor2);

        System.out.println("Instructor Profiles:");
        instructor1.printProfile();
        instructor2.printProfile();

        System.out.println("Course Summaries:");
        course1.printSummary();
        course2.printSummary();

        System.out.println("Student Profiles:");
        student1.printProfile();
        student2.printProfile();
    }
}
