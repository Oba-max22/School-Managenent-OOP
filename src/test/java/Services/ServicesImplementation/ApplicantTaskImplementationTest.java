package Services.ServicesImplementation;

import model.Person;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import static Services.ServicesImplementation.ApplicantTaskImplementation.applicants;
import static org.junit.jupiter.api.Assertions.*;

class ApplicantTaskImplementationTest {

    Person applicant1 = new Person("Ambrose", "Alli", 16, "male", "Applicant");
    ApplicantTaskImplementation applicantTaskImplementation = new ApplicantTaskImplementation();

    @Test
    void getApplicants() {
        assertEquals(applicants, ApplicantTaskImplementation.getApplicants());
    }

    @Test
    void makeApplication() throws NoPermissionException {
        assertEquals("Application Successful!", applicantTaskImplementation.makeApplication(applicant1));
        assertNotEquals("Application Successful", applicantTaskImplementation.makeApplication(applicant1));
    }
}