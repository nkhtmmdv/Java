import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    String surname;
    double grade;
    String gender;
    Date birthdate;

    public Student(int id, String name, String surname, double grade, String gender, Date birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}

class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int gradeCompare = Double.compare(s2.grade, s1.grade);
        if (gradeCompare != 0) return gradeCompare;
        int birthdateCompare = s1.birthdate.compareTo(s2.birthdate);
        if (birthdateCompare != 0) return birthdateCompare;
        return s1.gender.compareTo(s2.gender);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(5, "John", "Doe", 88.0, "Male", new Date(102, 3, 10)));
        students.add(new Student(2, "Emily", "Clark", 91.5, "Female", new Date(99, 6, 25)));
        students.add(new Student(4, "Michael", "Johnson", 88.0, "Male", new Date(102, 3, 10)));
        students.add(new Student(1, "Sophia", "Miller", 95.0, "Female", new Date(98, 11, 5)));
        students.add(new Student(3, "Daniel", "Smith", 91.5, "Male", new Date(99, 6, 25)));

        Collections.sort(students);
        System.out.println("Sorted by ID:");
        students.forEach(System.out::println);

        students.sort(new GradeComparator());
        System.out.println("\nSorted by Grade, Birthdate, and Gender:");
        students.forEach(System.out::println);
        
        students.sort((s1, s2) -> {
            int gradeCompare = Double.compare(s2.grade, s1.grade);
            if (gradeCompare != 0) return gradeCompare;
            int birthdateCompare = s1.birthdate.compareTo(s2.birthdate);
            if (birthdateCompare != 0) return birthdateCompare;
            return s1.gender.compareTo(s2.gender);
        });

        System.out.println("\nSorted using Lambda:");
        students.forEach(System.out::println);
    }
}
