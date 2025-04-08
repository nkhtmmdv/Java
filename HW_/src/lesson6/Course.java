package lesson6;

import java.util.*;

public class Course {
    private String courseName;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        teacher.teach(this);
    }

    public void conductExam() {
        Exam exam = new Exam(this);
        for (Student student : students) {
            exam.grade(student, new Random().nextInt(101));
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }
}

