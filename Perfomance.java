package labs.lab1;

import java.time.LocalDate;
import java.util.Objects;

public class Performance {
    private String subject;
    private String teacher;
    private LocalDate dateOfConduct;
    private int grade;

    public Performance(String subject, String teacher, LocalDate dateOfConduct, int grade) {
        this.subject = subject;
        this.teacher = teacher;
        this.dateOfConduct = dateOfConduct;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public LocalDate getDateOfConduct() {
        return dateOfConduct;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Performance that = (Performance) o;
        return grade == that.grade && Objects.equals(subject, that.subject) && Objects.equals(dateOfConduct, that.dateOfConduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, dateOfConduct, grade);
    }

    @Override
    public String toString() {
        return "Performance{" +
                "subject='" + subject + '\'' +
                ", teacher='" + teacher + '\'' +
                ", dateOfConduct=" + dateOfConduct +
                ", grade=" + grade +
                '}';
    }
}
