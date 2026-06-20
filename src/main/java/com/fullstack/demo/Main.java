package src.main.java.com.fullstack.demo;

import java.util.ArrayList;
import src.main.java.com.fullstack.demo.model.Course;
import src.main.java.com.fullstack.demo.model.CourseOffering;
import src.main.java.com.fullstack.demo.model.Instructor;
import src.main.java.com.fullstack.demo.model.Student;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // Task 1 - Create course list
        // ==========================================
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("CS001", "Introduction to Computer Science", 40, "Beginner", "Fullstack Programming", true));
        courses.add(new Course("CS002", "React Frontend Development", 21, "Intermediate", "Frontend Development", true));
        courses.add(new Course("CS003", "MongoDB Basics", 14, "Beginner", "Database Management", false));

        // ==========================================
        // Task 2 - Create instructor list
        // ==========================================
        ArrayList<Instructor> instructors = new ArrayList<>();
        Instructor instructor1 = new Instructor("I001", "James Bond", "Artificial Intelligence");
        Instructor instructor2 = new Instructor("I002", "Benoit Blanc", "Cybersecurity");
        instructors.add(instructor1);
        instructors.add(instructor2);

        // Assign instructors to courses
        courses.get(0).setInstructor(instructor1);
        courses.get(1).setInstructor(instructor2);

        // ==========================================
        // Task 3 - Create student list
        // ==========================================
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Charlie Brown", "charlie@example.com"));
        students.add(new Student("S002", "Daisy Duck", "daisy@example.com"));
        students.add(new Student("S003", "Mickey Mouse", "mickey@example.com"));

        // ==========================================
        // Task 4 - Create course offering list
        // ==========================================
        ArrayList<CourseOffering> offerings = new ArrayList<>();
        offerings.add(new CourseOffering("OFF001", "Java Fundamentals - June 2026 Intake", courses.get(0), instructor1, "2026-06-19", "2026-06-20", 25, "Physical"));
        offerings.add(new CourseOffering("OFF002", "React Framework - June 2026 Intake", courses.get(1), instructor2, "2026-07-19", "2026-07-20", 21, "Hybrid"));

        // ==========================================
        // Task 5 - Print all records using loops
        // ==========================================
        
        System.out.println("========================================");
        System.out.println("        INSTRUCTOR PROFILES             ");
        System.out.println("========================================");
        for (Instructor instructor : instructors) {
            instructor.printProfile();
        }

        System.out.println("\n========================================");
        System.out.println("          COURSE SUMMARIES              ");
        System.out.println("========================================");
        for (Course course : courses) {
            course.printSummary();
        }

        System.out.println("\n========================================");
        System.out.println("          STUDENT PROFILES              ");
        System.out.println("========================================");
        for (Student student : students) {
            student.printProfile();
        }

        System.out.println("\n========================================");
        System.out.println("         COURSE OFFERINGS               ");
        System.out.println("========================================");
        for (CourseOffering offering : offerings) {
            // Assumed CourseOffering has a display or print method 
            // If it doesn't, you can replace this line with System.out.println statements
            System.out.println("Offering ID: " + offering.getOfferingId() + " - " + offering.getOfferingName());
            System.out.println("----------------------------");
        }
    }
}