package lesson6;

import java.util.*;

public class Exam implements Gradable {
    private Course course;
    private Map<Student, Integer> results = new HashMap<>();

    public Exam(Course course) {
        this.course = course;
    }

    @Override
    public void grade(Student student, int score) {
        results.put(student, score);
        student.setGrade(course, score);
    }

    public Map<Student, Integer> getResults() {
        return results;
    }
}
