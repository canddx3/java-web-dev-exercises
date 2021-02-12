package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    private String  gradeLevel;

    public Student ( String name, int studentId, int numberOfCredits, double gpa, String gradeLevel ) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
    }

    public static void main ( String[] args ) {
        Student sally = new Student("Sally", 1, 1, 4.0, "gradeLevel");
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(28, 3.8);
        System.out.println(sally);
        System.out.println(sally.studentInfo());
    }

    public String studentInfo () {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    // TODO: Complete the addGrade method.
    public void addGrade ( int courseCredits, double grade ) {
        double totalQualityScore = courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel () {
        if (this.numberOfCredits <= 29) {
            return "freshman";
        } else if (this.numberOfCredits <= 59) {
            return "sophmore";
        } else if (this.numberOfCredits <= 89) {
            return "Junior";
        }
        return "Senior";
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString () {
        return "Student: " +
                " name = " + name +
                ", studentId = " + studentId +
                ", numberOfCredits = " + numberOfCredits +
                ", gpa = " + gpa +
                ", gradeLevel = " + getGradeLevel();
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }
}
