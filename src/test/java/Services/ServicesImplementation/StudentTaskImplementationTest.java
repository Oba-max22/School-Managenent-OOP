package Services.ServicesImplementation;

import model.Person;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import static org.junit.jupiter.api.Assertions.*;

class StudentTaskImplementationTest {
    StudentTaskImplementation studentTaskImplementation = new StudentTaskImplementation();
    Person student = new Person("Percy", "Obiwan", 16, "male", "Student");
//        System.out.println(studentTaskImplementation.takeCourse(applicant2, "Economics"));

    @Test
    void takeCourse() throws NoPermissionException {
        assertEquals("Student Percy Obiwan has taken Computer Studies course.", studentTaskImplementation.takeCourse(student, "Computer Studies"));

    }
}