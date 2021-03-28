package com.emmanuel.macaulay.dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    Teacher teacher = new Teacher("Marie", "Yvonne", 32, 4, "Intermediate");

    @Test
    void addClass() {
        assertTrue(teacher.addClass());
    }

    @Test
    void teachCourse() {
        assertTrue(teacher.teachCourse("French"));
    }
}