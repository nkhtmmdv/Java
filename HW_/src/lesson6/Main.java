package lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Student> students = new ArrayList<>();
            List<Teacher> teachers = new ArrayList<>();
            List<Course> courses = new ArrayList<>();
            List<Exam> exams = new ArrayList<>();

            Teacher t1 = new Teacher("Ali", "Aliyev", 40, "ali@school.com", "0551112233");
            Teacher t2 = new Teacher("Leyla", "Mammadova", 35, "leyla@school.com", "0552223344");
            teachers.add(t1);
            teachers.add(t2);

            for (int i = 1; i <= 5; i++) {
                Student student = new Student("Student" + i, "Surname" + i, 20 + i, "s" + i + "@mail.com", "05000000" + i);
                students.add(student);

                Course c1 = new Course("Math" + i, t1);
                Course c2 = new Course("History" + i, t2);
                courses.add(c1);
                courses.add(c2);

                student.enrollInCourse(c1);
                student.enrollInCourse(c2);

                Exam exam1 = new Exam(c1);
                Exam exam2 = new Exam(c2);

                exam1.grade(student, new Random().nextInt(101));
                exam2.grade(student, new Random().nextInt(101));

                exams.add(exam1);
                exams.add(exam2);
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("students.json"), students);
            mapper.writeValue(new File("teachers.json"), teachers);
            mapper.writeValue(new File("courses.json"), courses);
            mapper.writeValue(new File("exams.json"), exams);
        } catch (Exception e) {
            GlobalExceptionHandler.handle(e);
        }
    }
}
