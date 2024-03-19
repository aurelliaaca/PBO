import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (Course course : coursesEnrolled) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
