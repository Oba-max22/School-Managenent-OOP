package com.emmanuel.macaulay.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    private final Principal principal = new Principal("Alex", "Macho", 54, 2, "Senior");
    private final Applicant applicant1 = new Applicant("Paul","Babalola", 15, 24);
    private final Applicant applicant2 = new Applicant("Bimbo","Okonkwo", 19, 26);
    Student student = new Student("Ada","Nwachukwu", 19, 22);

    @Test
    void admit() {
        principal.admit(applicant1);
        principal.admit(applicant2);
        assertEquals("Failed!", applicant1.getApplicationStatus());
        assertEquals("Successful!", applicant2.getApplicationStatus());
    }

    @Test
    void warn() {
        principal.warn(student);
        assertEquals("Suspension!", student.getStudentStatus());

    }

    @Test
    void expel() {
        principal.expel(student);
        assertEquals("Expelled!", student.getStudentStatus());
    }

}