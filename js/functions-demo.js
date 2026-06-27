const course = {
    courseId: "C001",
    title: "Javscript Fundamentals",
    durationHours: 12,
    level: "Beginner",
    instructor: "John Doe"
}

//Normal function to display course details
function formatCourse(course) {
    return `${course.id} - ${course.title} - Duration: ${course.durationHours} hours - Level: ${course.level}`
};

// Arrow function to display course details Java lambda
const formatCourseArrow = (course) => {
    return `${course.id} - ${course.title} - Duration: ${course.durationHours} hours - Level: ${course.level}`
}

const getCourseTitle = (course) => course.title