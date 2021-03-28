package com.emmanuel.macaulay.dev;

public class NonAcademicStaff extends Staff {
    private String staffRole;
    public NonAcademicStaff(String firstName, String lastName, int age, int staffId, String staffLevel, String staffRole) {
        super(firstName, lastName, age, staffId, staffLevel);
        this.staffRole = staffRole;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    @Override
    public void getStaffDetails() {
        super.getStaffDetails();
    }
}
