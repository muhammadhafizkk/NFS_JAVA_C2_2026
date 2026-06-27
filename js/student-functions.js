const student = {
    studentId: "S001",
    studentName: "Ignacio de Paul",
    email: "ignacio@example.com",
    status: "Active"
}

function formatStudent(student) {
    return `${student.studentId} - ${student.studentName} (${student.status})`
}

const getStudentEmail = (student) => {
    return `${student.email}`
}

const getStudentStatus = (student) => student.status

console.log(formatStudent(student))
console.log(getStudentEmail(student))
console.log(getStudentStatus(student))