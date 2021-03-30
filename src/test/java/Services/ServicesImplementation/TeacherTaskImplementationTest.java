package Services.ServicesImplementation;

import model.Person;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTaskImplementationTest {
    Person teacher = new Person("Aramide", "Ayeopemeji", 27, "female", "Teacher");
    TeacherTaskImplementation teacherTaskImplementation = new TeacherTaskImplementation();
//        System.out.println(teacherTaskImplementation.addCourse(teacher,"Mathematics"));

//        System.out.println(teacherTaskImplementation.teachCourse(teacher, "SS2", "English Language"));


    @Test
    void teachCourse() throws NoPermissionException {
        assertEquals("Teacher Aramide Ayeopemeji has taught SS2 Students English Language.", teacherTaskImplementation.teachCourse(teacher, "SS2","English Language"));
    }

    @Test
    void addCourse() throws NoPermissionException {
        assertEquals("Mathematics has been added to courses.", teacherTaskImplementation.addCourse(teacher,"Mathematics"));
    }
}