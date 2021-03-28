package com.emmanuel.macaulay.dev;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private final Student student = new Student("Ada","Nwachukwu", 19, 22);

    @Test
    void takeCourse() {
        assertTrue(student.takeCourse("Mathematics"));
    }

    @Test
    void getStudentStatus() {
        assertEquals("Good!", student.getStudentStatus());
    }

    @Test
    void getStudentId() {
        assertEquals(22, student.getStudentId());
    }

}