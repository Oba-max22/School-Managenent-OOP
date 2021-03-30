package Services.ServicesImplementation;

import Services.PrincipalTasks;
import model.Person;


import javax.naming.NoPermissionException;
import java.util.ArrayList;

public class PrincipalTaskImplementation implements PrincipalTasks {
    public static ArrayList<Person> students = new ArrayList<>();

    public static ArrayList<Person> getStudents() {
        return students;
    }

    /**
     * admit method helps to admit students based on age
     * @param principal
     * @param applicant
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String admit(Person principal, Person applicant) throws NoPermissionException {
        if (principal.getRole()!=null && principal.getRole().equals("Principal")){
            int applicantAge = applicant.getAge();
            if (applicantAge >= 13 && applicantAge <= 19) {
                applicant.setRole("Student");
                // List of students before adding one applicant
                System.out.println("Students before :: " + students);
                students.add(applicant);
                // List of students after adding one applicant
                System.out.println("Students  after:: " + students);
                ArrayList<Person> applicantList = ApplicantTaskImplementation.getApplicants();
                // List of applicants before removing one
                System.out.println("Applicants before :: " + applicantList);
                applicantList.remove(applicant);
                // List of applicants after removing one
                System.out.println("Applicants  after :: " + applicantList);

                return "Student Admitted!";
            } else {
                return "Not Admitted!";
            }
        }
        else {
            throw new NoPermissionException("Only person's with the Principal role can admit students!");
        }
    }

    /**
     * expel method helps to expel students
     * @param principal
     * @param student
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String expel(Person principal, Person student) throws NoPermissionException {
        if (principal.getRole()!=null && principal.getRole().equals("Principal")){
            student.setRole("Expelled");
            students.remove(student);
            return "Student Expelled!";
        }
        else {
            throw new NoPermissionException("Only person's with the Principal role can expel students!");
        }
    }
}
