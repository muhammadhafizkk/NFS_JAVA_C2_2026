package src.main.java.com.fullstack.demo;

import java.util.List;
import java.util.Optional;

import src.main.java.com.fullstack.demo.model.Course;
import src.main.java.com.fullstack.demo.repository.CourseRepository;
import src.main.java.com.fullstack.demo.repository.InMemoryCourseRepository;

public class RepositoryPractice {
    public static void main(String[] args) {
        //The variable type is CourseRepository, but the actual object is InMemoryCourseRepository.
        CourseRepository courseRepository = new InMemoryCourseRepository();

        Course course1 = new Course("C005", "API Documentation", 7, "Beginner");
        Course course2 = new Course("C006", "Java Collections Practice", 12, "Beginner");
        Course course3 = new Course("C007", "Clean Code Basics", 8, "Intermediate");

        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);

        System.out.println("=== All Courses ===");

        List<Course> courses = courseRepository.findAll();
        for (Course course : courses) {
            course.printSummary();
        }

        System.out.println("\n=== Find C006 ===");

        Optional<Course> optionalCourse = courseRepository.findById("C006");
        if (optionalCourse.isPresent()){
            Course foundCourse = optionalCourse.get();
            foundCourse.printSummary();
        } else {
            System.out.println("Course not found");
        }

        System.out.println("\n=== Exists Check ===");
        
        System.out.println("C007 exists: " + courseRepository.existsById("C007"));
    }
}
