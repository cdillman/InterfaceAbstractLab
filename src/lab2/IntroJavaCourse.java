package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingClasses{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String setCourseName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String setCourseNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double setCredits() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void getCourseName(String courseName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void getCourseNumber(String courseNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void getCredits(double credits) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}