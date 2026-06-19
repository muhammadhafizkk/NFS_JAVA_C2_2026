public class Main {
    public static void main(String[] args) {
        Instructor intructor1 = new Instructor("I001", "James Bond", "Artificial Intelligence");
        Instructor intructor2 = new Instructor("I002", "Benoit Blanc", "Cybersecurity");
        
        Course course1 = new Course("CS001", "Introduction to Computer Science", 40, "Beginner", "Fullstack Programming", true);
        Course course2 = new Course("CS002", "React Frontend Development", 21, "Intermediate", "Frontend Developmenet", false);

        CourseOffering co1 = new CourseOffering("OFF001", "Java Fundamentals - June 2026 Intake", course1, intructor1, "2026-06-19", "2026-06-20", 25, "Physical");
        CourseOffering co2 = new CourseOffering("OFF002", "React Framework - June 2026 Intake", course2, intructor2, "2026-07-19", "2026-07-20", 21, "Hybrid");

        co1.printOfferingSummary();
        co2.printOfferingSummary();
    }
}
