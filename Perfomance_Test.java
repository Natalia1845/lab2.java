package labs.lab1.tests;

import labs.lab1.Performance;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTest {

    @Test
    void testPerformanceCreation() {
        Performance performance = new Performance("Math", "Mr. Brown", LocalDate.of(2024, 1, 10), 90);

        assertEquals("Math", performance.getSubject());
        assertEquals("Mr. Brown", performance.getTeacher());
        assertEquals(LocalDate.of(2024, 1, 10), performance.getDateOfConduct());
        assertEquals(90, performance.getGrade());
    }

    @Test
    void testPerformanceEquals() {
        Performance p1 = new Performance("Math", "Mr. Brown", LocalDate.of(2024, 1, 10), 90);
        Performance p2 = new Performance("Math", "Mr. Brown", LocalDate.of(2024, 1, 10), 90);

        assertEquals(p1, p2);
    }

    @Test
    void testPerformanceNotEquals() {
        Performance p1 = new Performance("Math", "Mr. Brown", LocalDate.of(2024, 1, 10), 90);
        Performance p2 = new Performance("English", "Ms. White", LocalDate.of(2024, 1, 15), 85);

        assertNotEquals(p1, p2);
    }
}
