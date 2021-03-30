package Services.ServicesImplementation;

import Services.TeacherTasks;
import model.Person;


import javax.naming.NoPermissionException;
import java.util.ArrayList;

public class TeacherTaskImplementation implements TeacherTasks {
    private ArrayList<String> courses = new ArrayList<>();

    /**
     * addCourse helps to add courses to course list
     * @param teacher
     * @param courseName
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String addCourse(Person teacher, String courseName) throws NoPermissionException {

        if (teacher.getRole()!=null && teacher.getRole().equals("Teacher")){
            courses.add(courseName);
            return (courseName  + " has been added to courses.");
        }
        else {
            throw new NoPermissionException("Only person's with the teacher role can add courses!");
        }
    }

    /**
     * teach course helps to teach a course
     * @param teacher
     * @param className
     * @param courseName
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String teachCourse(Person teacher, String className, String courseName) throws NoPermissionException {
        if (teacher.getRole()!=null && teacher.getRole().equals("Teacher")){
            return "Teacher " + teacher.getFullName() + " has taught " + className + " Students " + courseName + ".";
        }
        else {
            throw new NoPermissionException("Only person's with the teacher role can teach courses!");
        }
    }
}
