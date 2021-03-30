package Services;

import model.Person;

import javax.naming.NoPermissionException;

public interface TeacherTasks {
     String addCourse(Person teacher, String courseName) throws NoPermissionException;
     String teachCourse(Person person, String className, String courseName) throws NoPermissionException;
}
