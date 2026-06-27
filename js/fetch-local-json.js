const statusMessage = document.getElementById('status-message')
const courseList = document.getElementById('course-list')

function renderCourses(courses) {
    courseList.innerHTML = ''

    if (courses.length === 0) {
        statusMessage.textContent = 'No courses found'
        return
    }

    courses.forEach(course => {
        const courseCard = document.createElement('div')

        courseCard.innerHTML = `
        <h2>${course.title}</h2>
        <p>Course ID: ${course.courseId}</p>
        <p>Duration: ${course.durationHours} hours</p>
        <p>Level: ${course.level}</p>
        `
        courseList.appendChild(courseCard)
    })
    
}

async function loadCourses(){
    try {
        statusMessage.textContent = 'Loading courses...'

        const response = await fetch('courses.json')
        if (!response.ok) {
            throw new Error('Failed to fetch courses.json')
        }

        const courses = await response.json()

        statusMessage.textContent = ''
        renderCourses(courses)
    } catch (error) {
        statusMessage.textContent = 'Error loading courses ' + error.message
    }
}

loadCourses();