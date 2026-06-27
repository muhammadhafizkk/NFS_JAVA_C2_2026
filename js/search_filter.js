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

const courseList = document.getElementById("course-list")
const searchInput = document.getElementById("search-input")
const searchButton = document.getElementById("search-button")
const resetButton = document.getElementById("reset-button")

function renderCourses(courseArray){
    courseList.innerHTML = ""

    if (courseArray.length === 0) {
        courseList.innerHTML="<p>No courses available</p>"
        return;
    }

    courseArray.forEach((course) => {
        const courseCard = document.createElement("div")

        courseCard.innerHTML = `
        <h2>${course.title}</h2>
        <p>Course ID: ${course.courseId}</p>
        <p>Duration: ${course.durationHours} hours</p>
        <p>Level: ${course.level}</p>
        `

        courseList.appendChild(courseCard);
    })
}

searchButton.addEventListener("click", () => {
    const keyword = searchInput.value.trim().toLowerCase();

    const results = courses.filter((course) => {
        return course.title.toLowerCase().includes(keyword)
    })

    renderCourses(results)
})

resetButton.addEventListener("click", () => {
    searchInput.value = ""
    renderCourses(courses)
})

renderCourses(courses)