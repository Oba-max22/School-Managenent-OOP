package com.emmanuel.macaulay.dev;

public class Teacher extends Staff implements Classes{
    public Teacher(String firstName, String lastName, int age, int staffId, String staffLevel) {
        super(firstName, lastName, age, staffId, staffLevel);
    }

    @Override
    public boolean addClass() {
        System.out.println("Teacher " + getFullName() + " added a new class!");
        return true;
    }

    public boolean teachCourse (String courseName) {
        System.out.println(courseName  + " course taught by" + " Teacher " + getLastName() + ".");
        return true;
    }

    @Override
    public void getStaffDetails() {
        super.getStaffDetails();
    }


}
