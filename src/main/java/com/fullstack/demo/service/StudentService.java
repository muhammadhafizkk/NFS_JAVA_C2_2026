package src.main.java.com.fullstack.demo.service;

import java.util.ArrayList;
import java.util.List;

import src.main.java.com.fullstack.demo.exception.DuplicateStudentException;
import src.main.java.com.fullstack.demo.exception.InvalidStudentException;
import src.main.java.com.fullstack.demo.exception.StudentNotFoundException;
import src.main.java.com.fullstack.demo.model.Student;
import src.main.java.com.fullstack.demo.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student registerStudent(Student student) {
        validateStudent(student);

        if (studentRepository.existsById(student.getStudentId())) {
            throw new DuplicateStudentException(student.getStudentId());
        }
        return studentRepository.save(student);
    }

    public Student getStudentById(String studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new StudentNotFoundException(studentId));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> searchByNameUsingLoop(String name) {
        final String safeName = (name == null) ? "" : name.trim().toLowerCase();
        List<Student> results = new ArrayList<>();

        for (Student student : studentRepository.findAll()) {
            if (student.getStudentName().toLowerCase().contains(safeName)) {
                results.add(student);
            }
        }

        return results;
    }

    private void validateStudent(Student student){
        if (student == null) {
            throw new InvalidStudentException("Student cannot be null.");
        }
        if (isBlank(student.getStudentId())) {
            throw new InvalidStudentException("Student ID is required.");
        }
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
