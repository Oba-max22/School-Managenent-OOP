package Services;

import model.Person;

import javax.naming.NoPermissionException;

public interface ApplicantTasks {
    String makeApplication(Person person) throws NoPermissionException;
}
