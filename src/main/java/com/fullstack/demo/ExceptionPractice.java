package src.main.java.com.fullstack.demo;

import src.main.java.com.fullstack.demo.exception.CourseNotFoundException;
import src.main.java.com.fullstack.demo.model.Course;
import src.main.java.com.fullstack.demo.repository.CourseRepository;
import src.main.java.com.fullstack.demo.repository.InMemoryCourseRepository;
import src.main.java.com.fullstack.demo.service.CourseService;

public class ExceptionPractice {
    public static void main(String[] args) {
        CourseRepository courseRepository = new InMemoryCourseRepository();
        CourseService courseService = new CourseService(courseRepository);

        Course Course1 = new Course("C001","Java Fundamentals", 18, "Beginner");
        Course Course2 = new Course("C002","React Frontend Development", 10, "Intermediate");
        courseService.createCourse(Course1);
        courseService.createCourse(Course2);

        Course foundCourse = courseService.getCourseById("C001");
        foundCourse.printSummary();
        
        try {
            Course missingCourse = courseService.getCourseById("C999");
            missingCourse.printSummary();
        } catch (CourseNotFoundException e) {
            System.out.println("Friendly message for user: " + e.getMessage());
        }

        try {
            Course missingCourse2 = courseService.getCourseById("C888");
            missingCourse2.printSummary();
        } catch (CourseNotFoundException e) {
            System.out.println("Cannot display course details because the course does not exist.");
        }
    }
}
