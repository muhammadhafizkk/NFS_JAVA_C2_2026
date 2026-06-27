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

console.log("=== forEach: Print all course titles ===")
courses.forEach((course) => {
    console.group(course.title)
})

console.log("\n=== filter: Get all beginner courses ===")
const beginnerCourses = courses.filter((course) => course.level === "Beginner")
console.log(beginnerCourses)

console.log("\n=== find: Course C002 ====")
const foundCourse = courses.find((course) => {
    return course.courseId === "C002"
})
console.log(foundCourse)

console.log("\n map: Course titles only ===")
const courseTitles = courses.map((course) => course.title)
console.log(courseTitles)

const newLengthAfterPush = courses.push({
    courseId: "C005",
    title: "Node.js Backend Development",
    durationHours: 20,
    level: "Intermediate"
})
console.log("\n=== push: Add new last course ===")
console.log(courses)

const removedCourse = courses.pop()
console.log("\n=== pop: Removed the last course ===")
console.log(courses)
console.log("Removed courses: " + removedCourse)