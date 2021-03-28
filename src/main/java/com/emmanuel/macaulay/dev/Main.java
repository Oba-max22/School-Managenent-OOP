package com.emmanuel.macaulay.dev;

public class Main {
    public static void main(String[] args) {

        Applicant applicant0 = new Applicant("Paul","Babalola", 15, 1);
        applicant0.getApplicantDetails();
        applicant0.apply();
        System.out.println(applicant0.getApplicationStatus());

        Principal principal = new Principal("Alex", "Macho", 54, 1, "Senior");
        principal.getStaffDetails();

        principal.admit(applicant0);
        System.out.println(applicant0.getApplicationStatus());

        Student student0 = new Student("Ada","Nwachukwu", 19, 22);
        System.out.println(principal.warn(student0));
        System.out.println(principal.expel(student0));

        student0.takeCourse("Mathematics");

        Teacher teacher = new Teacher("Marie", "Yvonne", 32, 4, "Intermediate");
        teacher.teachCourse("French");
        teacher.addClass();




    }
}
