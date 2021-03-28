package com.emmanuel.macaulay.dev;

public class Student extends Person implements Courses{
    private int studentId;
    private String studentStatus;

    public Student(String firstName, String lastName, int age, int studentId) {
        this(firstName,lastName,age, studentId,"Good!");
    }

    public Student(String firstName, String lastName, int age, int studentId, String studentStatus) {
        super(firstName, lastName, age);
        this.studentId = studentId;
        this.studentStatus = studentStatus;
    }

    public boolean takeCourse(String courseName) {
        System.out.println("Student " + getFullName() + " with student ID " + getStudentId()
                + " has taken " + courseName + " course.");
        return true;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
