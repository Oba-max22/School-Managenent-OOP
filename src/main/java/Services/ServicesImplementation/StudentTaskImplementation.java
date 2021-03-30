package Services.ServicesImplementation;

import Services.StudentTasks;
import model.Person;

import javax.naming.NoPermissionException;

public class StudentTaskImplementation implements StudentTasks {
    /**
     * takeCourse method helps students take a course
     * @param student
     * @param courseName
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String takeCourse(Person student, String courseName) throws NoPermissionException {
        if (student.getRole()!=null && student.getRole().equals("Student")){
            return ("Student " + student.getFullName() + " has taken " + courseName  + " course.");
        }
        else {
            throw new NoPermissionException("Only person's with the student role can take courses!");
        }
    }
}
