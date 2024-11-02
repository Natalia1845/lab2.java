package labs.lab1;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String recordBookNumber;

    private Student(String firstName, String lastName, LocalDate birthDate, String recordBookNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.recordBookNumber = recordBookNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(recordBookNumber, student.recordBookNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordBookNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", recordBookNumber='" + recordBookNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }

    public static Comparator<Student> compareByFirstName() {
        return Comparator.comparing(Student::getFirstName);
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private String recordBookNumber;

        public StudentBuilder(String recordBookNumber) {
            this.recordBookNumber = recordBookNumber;
        }

        public StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Student build() {
            return new Student(this.firstName, this.lastName, this.birthDate, this.recordBookNumber);
        }
    }
}
