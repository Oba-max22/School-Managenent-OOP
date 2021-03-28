package com.emmanuel.macaulay.dev;

public abstract class Staff extends Person{
    private int staffId;
    private String staffLevel;

    public Staff(String firstName, String lastName, int age, int staffId, String staffLevel) {
        super(firstName, lastName, age);
        this.staffId = staffId;
        this.staffLevel = staffLevel;
    }

    public String getStaffLevel() {
        return staffLevel;
    }

    public void setStaffLevel(String staffLevel) {
        this.staffLevel = staffLevel;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void getStaffDetails() {
        System.out.println("-------------------");
        System.out.println("Staff Details");
        System.out.println("-------------------");
        System.out.println("Full name :: " + getFullName());
        System.out.println("Age :: " + getAge());
        System.out.println("Staff Id :: " + getStaffId());
        System.out.println("Staff Level :: " + getStaffLevel());
        System.out.println(" ");
    }

}
