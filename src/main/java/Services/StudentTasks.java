package Services;

import model.Person;

import javax.naming.NoPermissionException;

public interface StudentTasks {
    String takeCourse(Person student, String courseName) throws NoPermissionException;
}
