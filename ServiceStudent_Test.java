package labs.lab1.tests;

import labs.lab1.Performance;
import labs.lab1.Student;
import labs.lab1.StudentService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testSortStudentsByLastName() {
        StudentService studentService = new StudentService();
        List<Student> students = new ArrayList<>();
        students.add(new Student.StudentBuilder("002").firstName("Alice").lastName("Doe").build());
        students.add(new Student.StudentBuilder("001").firstName("John").lastName("Doe").build());

        List<Student> sorted = studentService.sortStudentsByLastName(students);

        assertEquals("John", sorted.get(0).getFirstName());
        assertEquals("Alice", sorted.get(1).getFirstName());
    }

    @Test
    void testSortStudentsByFirstName() {
        StudentService studentService = new StudentService();
        List<Student> students = new ArrayList<>();
        students.add(new Student.StudentBuilder("002").firstName("Alice").lastName("Doe").build());
        students.add(new Student.StudentBuilder("001").firstName("John").lastName("Doe").build());

        List<Student> sorted = studentService.sortStudentsByFirstName(students);

        assertEquals("Alice", sorted.get(0).getFirstName());
        assertEquals("John", sorted.get(1).getFirstName());
    }

    @Test
    void testFindStudentsByBirthYear() {
        StudentService studentService = new StudentService();
        List<Student> students = new ArrayList<>();
        students.add(new Student.StudentBuilder("001").firstName("John").lastName("Doe").birthDate(LocalDate.of(2000, 1, 15)).build());
        students.add(new Student.StudentBuilder("002").firstName("Jane").lastName("Smith").birthDate(LocalDate.of(1999, 2, 20)).build());

        List<Student> found = studentService.findStudentsByBirthYear(students, 2000);

        assertEquals(1, found.size());
        assertEquals("John", found.get(0).getFirstName());
    }

    @Test
    void testCalculateAverageGrade() {
        StudentService studentService = new StudentService();
        List<Performance> performances = new ArrayList<>();
        performances.add(new Performance("Math", "Mr. Brown", LocalDate.of(2024, 1, 10), 90));
        performances.add(new Performance("English", "Ms. White", LocalDate.of(2024, 1, 15), 85));

        double average = studentService.calculateAverageGrade(performances);

        assertEquals(87.5, average);
    }
}
