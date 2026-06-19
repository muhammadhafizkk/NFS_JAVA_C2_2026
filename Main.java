public class Main {
    public static void main(String[] args) {
        //Instructor intructor1 = new Instructor("I001", "James Bond", "Artificial Intelligence");
        //Instructor intructor2 = new Instructor("I002", "Benoit Blanc", "Cybersecurity");
        
        Course course1 = new Course("CS001", "Introduction to Computer Science", 40, "Beginner", "Fullstack Programming", true);
        Course course2 = new Course("CS002", "React Frontend Development", 21, "Intermediate", "Frontend Developmenet", false);
        
        course1.printSummary();
        course2.printSummary();
    }
}
