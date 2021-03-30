package Services.ServicesImplementation;

import model.Person;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import static Services.ServicesImplementation.PrincipalTaskImplementation.students;
import static org.junit.jupiter.api.Assertions.*;

class PrincipalTaskImplementationTest {
    Person applicant1 = new Person("Melody", "Oyadotun", 15, "female", "Applicant");
    Person applicant2 = new Person("Ade", "Bello", 20, "female", "Applicant");
    Person principal = new Person("Fela", "Kuti", 54, "male", "Principal");
    PrincipalTaskImplementation principalTaskImplementation = new PrincipalTaskImplementation();

    @Test
    void getStudents() {
        assertEquals(students, PrincipalTaskImplementation.getStudents());
    }

    @Test
    void admit() throws NoPermissionException {
        assertEquals("Student Admitted!", principalTaskImplementation.admit(principal, applicant1));
        assertEquals("Student", applicant1.getRole()); //Applicant1 is now a student
        assertNotEquals("Applicant", applicant1.getRole());
        assertEquals("Not Admitted!", principalTaskImplementation.admit(principal, applicant2));
        assertNotEquals("Student", applicant2.getRole());
        assertEquals("Applicant", applicant2.getRole()); // Applicant2 is still an aplicant
    }

    @Test
    void expel() throws NoPermissionException {
        assertEquals("Student Expelled!", principalTaskImplementation.expel(principal, applicant1));
    }
}