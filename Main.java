package labs.lab1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student.StudentBuilder("001").firstName("John").lastName("Doe").birthDate(LocalDate.of(2000, 1, 15)).build());
        students.add(new Student.StudentBuilder("002").firstName("Jane").lastName("Smith").birthDate(LocalDate.of(2001, 2, 20)).build());
        students.add(new Student.StudentBuilder("003").firstName("Alice").lastName("Doe").birthDate(LocalDate.of(1999, 3, 10)).build());

        StudentService studentService = new StudentService();

        // Сортування студентів за прізвищем
        List<Student> sortedByLastName = studentService.sortStudentsByLastName(students);
        System.out.println("Sorted by Last Name: " + sortedByLastName);

        // Сортування студентів за ім'ям
        List<Student> sortedByFirstName = studentService.sortStudentsByFirstName(students);
        System.out.println("Sorted by First Name: " + sortedByFirstName);

        // Пошук студентів за роком народження
        List<Student> bornIn2000 = studentService.findStudentsByBirthYear(students, 2000);
        System.out.println("Students born in 2000: " + bornIn2000);

        // Додавання успішності студентів
        List<Performance> performances = new ArrayList<>();
        performances.add(new Performance("Math", "Mr. Brown", LocalDate.of(2024, 1, 10), 90));
        performances.add(new Performance("English", "Ms. White", LocalDate.of(2024, 1, 15), 85));

        // Обчислення середньої оцінки
        double averageGrade = studentService.calculateAverageGrade(performances);
        System.out.println("Average Grade: " + averageGrade);
    }
}
