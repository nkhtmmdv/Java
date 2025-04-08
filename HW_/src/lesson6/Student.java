package lesson6;

import java.util.*;

public class Student extends Human {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, Integer> courseGrades = new HashMap<>();

    public Student(String name, String surname, int age, String email, String phoneNumber) {
        super(name, surname, age, email, phoneNumber);
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void setGrade(Course course, int grade) {
        courseGrades.put(course, grade);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Map<Course, Integer> getCourseGrades() {
        return courseGrades;
    }
}
