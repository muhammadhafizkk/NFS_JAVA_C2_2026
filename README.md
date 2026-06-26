# NFS_JAVA_C2_2026

Exercise 1

a)
i) What is the purpose of Course.java?
It defines the Course class and its properties and methods.

ii) What is the purpose of Instructor.java?
It defines the Instructor class and its properties and methods.

iii) What is the purpose of Student.java?
It defines the Student class and its properties and methods.

iv) What does the constructor do?
A constructor initializes an object when it is created, assigning initial values to its fields.

v) Why are the fields marked as private?
To enforce encapsulation and prevent direct access to the object's data from outside the class.

vi) What does course1.assignInstructor(instructor1); mean?
It means to assign an Instructor object to a Course object

vii) What does student1.printProfile(); do?
It prints out the details of the Student object.

b)
i) One explanation from AI that helped you
The AI explained that Java classes are similar to C++ classes. A class acts as a blueprint for creating objects, and constructors are automatically called when an object is created to initialize its data. The AI also explained that private fields support encapsulation by restricting direct access to an object's data.

ii) One part you still needed the trainer or your own reading to understand.
I needed more insight into best practices for maintaining loose coupling between classes when objects are passed and stored as fields, especially in larger systems where composition relationships can lead to unintended side effects if objects are modified externally.

Exercise 3

CourseOffering is more useful than using only Course because a single course can be offered multiple times with different schedules, instructors, capacities, and delivery modes. For example, the course "Java Fundamentals" may have a June 2026 intake taught by one instructor and an August 2026 intake taught by another instructor.

By separating Course and CourseOffering, the application follows a more realistic data model. The Course class stores general information about the course itself, while the CourseOffering class stores information specific to a particular intake or session. This approach reduces data duplication and makes it easier to manage enrollments, schedules, instructors, and course availability.

Day 3 - Exercise 1
It goes through CourseService, then Course Repository, then InMemoryCourseRepository

day 3 - Exercise 2
InMemoryCourseRepository is a temporary storage because if we end the execution of the code or restart it, we lost all the data stored.The data only exists while the Java application is running.

A repository implementation that communicates with MongoDB would replace it.
