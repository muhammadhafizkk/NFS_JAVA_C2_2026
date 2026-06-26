package src.main.java.com.fullstack.demo;

import java.util.List;

import src.main.java.com.fullstack.demo.model.Course;
import src.main.java.com.fullstack.demo.repository.CourseRepository;
import src.main.java.com.fullstack.demo.repository.InMemoryCourseRepository;
import src.main.java.com.fullstack.demo.service.CourseService;

public class SearchPractice {
    public static void main(String[] args) {
        CourseRepository courseRepository = new InMemoryCourseRepository();
        CourseService courseService = new CourseService(courseRepository);

        Course course1 = new Course("C001", "Java Fundamentals", 14, "Beginner");
        Course course2 = new Course("C002", "React Frontend Development", 21, "Intermediate");
        Course course3 = new Course("C003", "MongoDB Basics", 16, "Beginner");
        Course course4 = new Course("C004", "Spring Boot API Development", 20, "Intermediate");
        courseService.createCourse(course1);
        courseService.createCourse(course2);
        courseService.createCourse(course3);
        courseService.createCourse(course4);

        System.out.println("=== Beginner Courses ===");
        List<Course> beginnerCourses = courseService.searchByLevelUsingLoop("Beginner");
        for (Course course : beginnerCourses) {
            course.printSummary();
        }
    }
}
