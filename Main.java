public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("CS001", "Introduction to Computer Science", 40, "Beginner");
        Course course2 = new Course("CS002", "React Frontend Development", 21, "Intermediate");
        course1.printSummary();
        course2.printSummary();
    }
}
