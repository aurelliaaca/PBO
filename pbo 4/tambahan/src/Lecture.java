import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (Course course : coursesTaught) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
