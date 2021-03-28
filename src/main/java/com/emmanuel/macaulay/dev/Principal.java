package com.emmanuel.macaulay.dev;

public class Principal extends Staff {

    public Principal(String firstName, String lastName, int age, int staffId, String staffLevel) {
        super(firstName, lastName, age, staffId, staffLevel);
    }

    @Override
    public void getStaffDetails() {
        // Polymorphism, this overridden method has been changed.
        System.out.println("-------------------");
        System.out.println("Principal's Details");
        System.out.println("-------------------");
        System.out.println("Full name :: " + getFullName());
        System.out.println("Age :: " + getAge());
        System.out.println("Principal's Id :: " + getStaffId());
        System.out.println("Principal's Level :: " + getStaffLevel());
        System.out.println(" ");
    }

    public void admit(Applicant applicant) {
        if (applicant.getAge() >= 18) {
            applicant.setApplicationStatus("Successful!");
        } else {
            applicant.setApplicationStatus("Failed!");
        }
    }

    public String warn(Student student) {
        student.setStudentStatus("Suspension!");
        return ("Student with student ID " + student.getStudentId() + " and name " + student.getFullName() + " has been issued a WARNING!");
    }

    public String expel(Student student) {
        student.setStudentStatus("Expelled!");
        return ("Student with student ID " + student.getStudentId() + " and name " + student.getFullName() + " had been EXPELLED with immediate effect.");
    }
}
