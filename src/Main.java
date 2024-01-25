// A class to represent a person
public class Main {
    // Fields for name and address
    private String name;
    private String address;

    // A field for the number of courses that a person can take
    private int courseLimit;

    // A constructor that takes name and address as parameters
    public Main(String name, String address) {
        this.name = name;
        this.address = address;
        // Set the course limit to 5 by default
        this.courseLimit = 5;
    }

    // A constructor that takes name, address, and course limit as parameters
    public Main(String name, String address, int courseLimit) {
        this.name = name;
        this.address = address;
        this.courseLimit = courseLimit;
    }

    // Getters and setters for name, address, and course limit
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCourseLimit() {
        return courseLimit;
    }

    public void setCourseLimit(int courseLimit) {
        this.courseLimit = courseLimit;
    }

    // A method to check if the person can take a course
    public void checkCourseLimit(int currentCourses) throws Exception {
        // If the current number of courses is equal to or greater than the limit
        if (currentCourses >= courseLimit) {
            // Throw an exception with a custom error message
            throw new Exception("Error: You have reached the course limit of " + courseLimit);
        }
    }
}

// A class to represent a course