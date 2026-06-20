package src.main.java.com.fullstack.demo.service;

import java.util.List;
//import java.util.Optional;
import java.util.stream.Collectors;

import src.main.java.com.fullstack.demo.repository.CourseRepository;
import src.main.java.com.fullstack.demo.exception.InvalidCourseException;
import src.main.java.com.fullstack.demo.exception.CourseNotFoundException;
import src.main.java.com.fullstack.demo.exception.DuplicateCourseException;
import src.main.java.com.fullstack.demo.model.Course;
import src.main.java.com.fullstack.demo.model.Instructor;

public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course) {
        validateCourse(course);
        
        if (courseRepository.existsById(course.getCourseId())) {
            throw new DuplicateCourseException(course.getCourseId());
        }
        return courseRepository.save(course);
    }

    public Course getCourseById(String courseId) {
        return courseRepository.findById(courseId)
                .orElseThrow(() -> new CourseNotFoundException(courseId));
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<Course> searchByTitle(String keyword) {
        final String searchKeyword = (keyword == null) ? "" : keyword.toLowerCase().trim();

        return courseRepository.findAll().stream()
                .filter(course -> course.getTitle() != null && 
                                  course.getTitle().toLowerCase().contains(searchKeyword))
                .collect(Collectors.toList());
    }

    public List<Course> filterByLevel(String level) {
        final String targetLevel = (level == null) ? "" : level.toLowerCase().trim();

        return courseRepository.findAll().stream()
                .filter(course -> course.getLevel() != null && 
                                  course.getLevel().toLowerCase().contains(targetLevel))
                .collect(Collectors.toList());
    }

    private void validateCourse(Course course) {
        if (course == null) {
            throw new InvalidCourseException("Course cannot be null.");
        }
        if (isBlank(course.getCourseId())) {
            throw new InvalidCourseException("Course ID is required.");
        }
        if (isBlank(course.getTitle())) {
            throw new InvalidCourseException("Course title is required.");
        }
        if (course.getDurationHours() <= 0) {
            throw new InvalidCourseException("Course duration must be greater than zero.");
        }
        if (isBlank(course.getLevel())) {
            throw new InvalidCourseException("Course level is required.");
        }
    }

    public Course assignInstructor(String courseId, Instructor instructor) {
        Course course = getCourseById(courseId);
        
        course.setInstructor(instructor);
        
        return courseRepository.save(course);
    }

    public List<Course> searchByInstructorName(String instructorName) {
        final String searchName = (instructorName == null) ? "" : instructorName.toLowerCase().trim();

        return courseRepository.findAll().stream()
                .filter(course -> course.getInstructor() != null)
                .filter(course -> course.getInstructor().getInstructorName() != null &&
                                  course.getInstructor().getInstructorName().toLowerCase().contains(searchName))
                .collect(Collectors.toList());
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}