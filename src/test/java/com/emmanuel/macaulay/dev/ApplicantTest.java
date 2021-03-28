package com.emmanuel.macaulay.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    private final Applicant applicant = new Applicant("Paul","Babalola", 15, 24);

    @Test
    void apply() {
        assertEquals("Application made!", applicant.apply());
        assertNotEquals("Application made", applicant.apply());
    }

    @Test
    void getApplicationStatus() {
        assertEquals("Pending!", applicant.getApplicationStatus());
        assertNotEquals("pending!", applicant.getApplicationStatus());
    }

    @Test
    void getAge() {
        assertEquals(15, applicant.getAge());
        assertNotEquals(15.01, applicant.getAge());
    }

    @Test
    void getApplicantId() {
        assertEquals(24, applicant.getApplicantId());
        assertNotEquals(24.001, applicant.getApplicantId());
    }

}
