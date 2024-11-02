package labs.lab1;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    public List<Student> sortStudentsByLastName(List<Student> students) {
        return students.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Student> sortStudentsByFirstName(List<Student> students) {
        return students.stream()
                .sorted(Student.compareByFirstName())
                .collect(Collectors.toList());
    }

    public List<Student> findStudentsByBirthYear(List<Student> students, int year) {
        return students.stream()
                .filter(student -> student.getBirthDate().getYear() == year)
                .collect(Collectors.toList());
    }

    public double calculateAverageGrade(List<Performance> performances) {
        return performances.stream()
                .mapToInt(Performance::getGrade)
                .average()
                .orElse(0.0);
    }
}
