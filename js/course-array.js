const courses = [
    {
        courseId: "C001",
        title: "Javscript Fundamentals",
        durationHours: 12,
        level: "Beginner",
    },
    {
        courseId: "C002",
        title: "React Frontend Developpmet",
        durationHours: 16,
        level: "Intermediate",
    },
    {
        courseId: "C003",
        title: "MongoDB Basics",
        durationHours: 8,
        level: "Advanced",
    }
]

console.log("=== Course Details ===")

for (const course of courses) {
    console.log(`${course.id} - ${course.title} - Duration: ${course.durationHours} hours - Level: ${course.level}`)
}

console.log("\nTotal Courses: " + courses.length)