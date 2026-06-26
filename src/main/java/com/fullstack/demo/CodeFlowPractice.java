package src.main.java.com.fullstack.demo;

import src.main.java.com.fullstack.demo.model.Course;
import src.main.java.com.fullstack.demo.repository.CourseRepository;
import src.main.java.com.fullstack.demo.repository.InMemoryCourseRepository;
import src.main.java.com.fullstack.demo.service.CourseService;

public class CodeFlowPractice {
    public static void main(String[] args) {
        //We create the repository first because the CourseService expects a CourseRepository object as a a parameter
        //CourseService needs  CourseRepository as a way to interact with the data stored in the LinkedHashMap
        CourseRepository courseRepository = new InMemoryCourseRepository();
        CourseService courseService = new CourseService(courseRepository);

        Course Course1 = new Course("C004","Spring Boot API Development", 18, "Intermediate");
        
        // 1. Demo class calls CourseService.
        // 2. CourseService validates the course.
        // 3. CourseService asks CourseRepository to save
        // 4. InMemoryCourseRepository stores the course in memory.
        courseService.createCourse(Course1);

        // CourseService asks CourseRepository to find the Course by ID.
        // InMemoryCourseRepository searches the LinkedHashMap and returns the Course object.
        Course foundCourse = courseService.getCourseById("C004");
        
        // 5. Course object is returned to the demo class.
        foundCourse.printSummary();
    }
}
