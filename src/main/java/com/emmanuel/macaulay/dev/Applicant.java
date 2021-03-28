package com.emmanuel.macaulay.dev;

public class Applicant extends Person{

    private int applicantId;
    private String applicationStatus;

    public Applicant(String firstName, String lastName, int age, int applicantId) {
        this(firstName,lastName,age,applicantId,"Pending!");

    }

    public Applicant(String firstName, String lastName, int age, int applicantId, String applicationStatus) {
        super(firstName, lastName, age);
        this.applicantId = applicantId;
        this.applicationStatus = applicationStatus;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantID(int applicantId) {
        this.applicantId = applicantId;
    }

    // can apply for admission in school
    public String apply() {
        return "Application made!";
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public void getApplicantDetails() {
        System.out.println("-------------------");
        System.out.println("Application Details");
        System.out.println("-------------------");
        System.out.println("Full name :: " + getFullName());
        System.out.println("Age :: " + getAge());
        System.out.println("Application Id :: " + getApplicantId());
        System.out.println("Application Status :: " + getApplicationStatus());
        System.out.println(" ");
    }
}
