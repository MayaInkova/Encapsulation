package student;

import java.util.Arrays;

public class Student extends Human  implements Comparable<Student> {
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }


    @Override
    public String toString() {
        return "Student{firstName='" + getFirstName() + "', lastName='" + getLastName() + "', grade=" + grade + "}";
    }
}


