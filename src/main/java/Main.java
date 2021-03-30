//import com.emmanuel.macaulay.dev.model.Person;

import Services.NonTeachingTasks;
import Services.ServicesImplementation.*;
import model.Person;

import javax.naming.NoPermissionException;
import java.security.Principal;

public class Main {
    public static void main(String[] args) throws NoPermissionException {
        // Instantiate a new object of the Person class with Applicant role
        Person applicant1 = new Person("Ambrose", "Alli", 16, "male", "Applicant");

        // Create an instance of the ApplicantTaskImplementation Class
        ApplicantTaskImplementation applicantTaskImplementation = new ApplicantTaskImplementation();
        // Call makeApplication method on the person
        applicantTaskImplementation.makeApplication(applicant1);

        // Create another Applicant
        Person applicant2 = new Person("Nwamaka", "Udo", 15, "female", "Applicant");
        applicantTaskImplementation.makeApplication(applicant2);

        // Create a Principal
        Person principal = new Person("Fela", "Kuti", 54, "male", "Principal");

        // Create an instance of the PrincipalTaskImplementation class
        PrincipalTaskImplementation principalTaskImplementation = new PrincipalTaskImplementation();
        // get and display the number of applicants in the list of applicants
        System.out.println("Number of Applicants :: " + ApplicantTaskImplementation.getApplicants().size());
        // Call the admit method with the Principal and applicant to admit
        principalTaskImplementation.admit(principal, applicant1);
        // The number of applicants should reduce by one and a new student should be added to the student list
        System.out.println("Number of Applicants :: " + ApplicantTaskImplementation.getApplicants().size());
        System.out.println("Number of Students :: " + PrincipalTaskImplementation.getStudents().size());

        // Call the admit method with the Principal and applicant to admit
        principalTaskImplementation.admit(principal, applicant2);
        // The number of applicants should reduce by one and a new student should be added to the student list
        System.out.println("Number of Applicants :: " + ApplicantTaskImplementation.getApplicants().size());
        System.out.println("Number of Students :: " + PrincipalTaskImplementation.getStudents().size());

        //Person student1 = new Person("Uche", "Kalu", 14, "male", "Student");
        principalTaskImplementation.expel(principal, applicant1);
        System.out.println("Number of Students :: " + PrincipalTaskImplementation.getStudents().size());

//        principalTaskImplementation.expel(principal, applicant2);
//        System.out.println("Number of Students :: " + PrincipalTaskImplementation.getStudents().size());

        Person teacher = new Person("Aramide", "Ayeopemeji", 27, "female", "Teacher");
        TeacherTaskImplementation teacherTaskImplementation = new TeacherTaskImplementation();
        System.out.println(teacherTaskImplementation.addCourse(teacher,"Mathematics"));

        System.out.println(teacherTaskImplementation.teachCourse(teacher, "SS2", "English Language"));

        System.out.println(applicant2.getRole());

        StudentTaskImplementation studentTaskImplementation = new StudentTaskImplementation();
        System.out.println(studentTaskImplementation.takeCourse(applicant2, "Economics"));

        Person security = new Person("Arnold","Smilth", 52, "male", "Security");
        Person chef = new Person("Marie","Mayer", 34, "female", "Chef");
        Person cleaner = new Person("George","Adetoye", 22, "male", "Cleaner");
        NonTeachingTaskImplementation nonTeachingTaskImplementation = new NonTeachingTaskImplementation();
        System.out.println(nonTeachingTaskImplementation.cookMeals(chef,"Jollof-Rice"));
        System.out.println(nonTeachingTaskImplementation.cleanYard(cleaner));
        System.out.println(nonTeachingTaskImplementation.closeGates(security));

//        applicantTaskImplementation.makeApplication(security);
    }
}
