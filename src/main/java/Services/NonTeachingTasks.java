package Services;

import model.Person;

import javax.naming.NoPermissionException;

public interface NonTeachingTasks {
    String cookMeals(Person chef, String foodName) throws NoPermissionException;
    String cleanYard(Person cleaner) throws NoPermissionException;
    String closeGates(Person security) throws NoPermissionException;
}
