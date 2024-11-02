package labs.lab1.tests;

import labs.lab1.Student;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testStudentCreation() {
        Student student = new Student.StudentBuilder("001")
                .firstName("John")
                .lastName("Doe")
                .birthDate(LocalDate.of(2000, 1, 15))
                .build();

        assertEquals("John", student.getFirstName());
        assertEquals("Doe", student.getLastName());
        assertEquals(LocalDate.of(2000, 1, 15), student.getBirthDate());
        assertEquals("001", student.getRecordBookNumber());
    }

    @Test
    void testStudentEquals() {
        Student student1 = new Student.StudentBuilder("001").firstName("John").lastName("Doe").build();
        Student student2 = new Student.StudentBuilder("001").firstName("Jane").lastName("Doe").build();

        assertEquals(student1, student2);
    }

    @Test
    void testStudentNotEquals() {
        Student student1 = new Student.StudentBuilder("001").firstName("John").lastName("Doe").build();
        Student student2 = new Student.StudentBuilder("002").firstName("John").lastName("Doe").build();

        assertNotEquals(student1, student2);
    }
}
