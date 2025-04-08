package lesson6;

import java.util.*;

public class Teacher extends Human implements Teachable {
    private List<Course> teachingCourses = new ArrayList<>();

    public Teacher(String name, String surname, int age, String email, String phoneNumber) {
        super(name, surname, age, email, phoneNumber);
    }

    @Override
    public void teach(Course course) {
        teachingCourses.add(course);
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }
}
