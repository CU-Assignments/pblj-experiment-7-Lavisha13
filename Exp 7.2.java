// Develop a Java application using JDBC and MVC architecture to manage student data. The application should:
//Use a Student class as the model with fields like StudentID, Name, Department, and Marks.
//Include a database table to store student data.
//Allow the user to perform CRUD operations through a simple menu-driven view.
//Implement database operations in a separate controller class.

CODE:
Q. 2 Ans

public class Student {
    private int studentID;
    private String name;
    private String department;
    private double marks;

    public Student(int studentID, String name, String department, double marks) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public int getStudentID() { return studentID; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setMarks(double marks) { this.marks = marks; }
}
