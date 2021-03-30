package Services.ServicesImplementation;

import Services.ApplicantTasks;
import model.Person;

import javax.naming.NoPermissionException;
import java.util.ArrayList;

public class ApplicantTaskImplementation implements ApplicantTasks {
    static ArrayList<Person> applicants = new ArrayList<>();

    public static ArrayList<Person> getApplicants() {
        return applicants;
    }

    /**
     * makeApplication method helps applicants to apply for admission
     * @param person
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String makeApplication(Person person) throws NoPermissionException {
        if (person.getRole()!=null && person.getRole().equals("Applicant")){
            applicants.add(person);
            return "Application Successful!";
        }
        else {
            throw new NoPermissionException("Only person's with Applicant role can apply to school!");
        }
    }
}
