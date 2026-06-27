const students = [
  { studentId: "S001", studentName: "Ignacio de Paul", email: "ignacio@example.com", status: "Active" },
  { studentId: "S002", studentName: "Ben Tan", email: "ben@example.com", status: "Inactive" },
  { studentId: "S003", studentName: "Chong Mei", email: "mei@example.com", status: "Active" },
  { studentId: "S004", studentName: "Ali Abu", email: "ali@example.com", status: "Active"}
];

const studentList = document.getElementById("student-list"); //Finding the element with id="student-list"

students.forEach((student) => {
    const studentCard = document.createElement("div"); //Creating a new div element

    studentCard.innerHTML = `
    <h2>${student.studentName}</h2>
    <p>Student ID: ${student.studentId}</p>
    <p>Email: ${student.email}</p>
    <p>Status: ${student.status}</p>
    `

    studentList.appendChild(studentCard) //Put the new element into the page under the element with id= "student"
})