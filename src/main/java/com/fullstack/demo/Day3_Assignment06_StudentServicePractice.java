package src.main.java.com.fullstack.demo;

import src.main.java.com.fullstack.demo.model.Student;
import src.main.java.com.fullstack.demo.repository.InMemoryStudentRepository;
import src.main.java.com.fullstack.demo.repository.StudentRepository;
import src.main.java.com.fullstack.demo.service.StudentService;

import java.util.List;

public class Day3_Assignment06_StudentServicePractice {
    public static void main(String[] args) {
        StudentRepository studentRepository = new InMemoryStudentRepository();
        StudentService studentService = new StudentService(studentRepository);

        Student student1 = new Student("S001", "Roberto Chan", "roberto@example.com");
        Student student2 = new Student("S002", "Priya Nair", "priya@example.com");
        Student student3 = new Student("S003", "Lee Salazae", "lee@example.com");

        System.out.println("=== Register Students ===");
        studentService.registerStudent(student1);
        studentService.registerStudent(student2);
        studentService.registerStudent(student3);

        System.out.println("=== All Students ===");
        printStudents(studentService.getAllStudents());

        System.out.println("=== Find Student By ID ===");
        Student foundStudent = studentService.getStudentById("S001");
        foundStudent.printProfile();

        System.out.println("=== Search Student By Name ===");
        List<Student> searchStudent = studentService.searchByNameUsingLoop("Lee");
        for (Student student : searchStudent) {
            student.printProfile();
        }

        System.out.println("=== Missing Student Test ===");
        Student missingStudent = studentService.getStudentById("S999");
        missingStudent.printProfile();
    }
    private static void printStudents(List<Student> students) {
            if (students.isEmpty()) {
                System.out.println("No students found.");
                return;
            }

            for (Student student : students) {
                student.printProfile();
            }
        }
}
