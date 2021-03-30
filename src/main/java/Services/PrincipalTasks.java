package Services;

import model.Person;

import javax.naming.NoPermissionException;

public interface PrincipalTasks {
    String admit(Person principal, Person applicant) throws NoPermissionException;
    String expel(Person principal, Person student) throws NoPermissionException;
}
