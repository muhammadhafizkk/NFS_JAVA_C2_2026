package src.main.java.com.fullstack.demo.repository;

import java.util.List;
import java.util.Optional;

import src.main.java.com.fullstack.demo.model.Student;

public interface StudentRepository {
    Student save(Student student);
    Optional<Student> findById(String studentId);
    List<Student> findAll();
    void deleteById(String studentId);
    boolean existsById(String studentId);
}
