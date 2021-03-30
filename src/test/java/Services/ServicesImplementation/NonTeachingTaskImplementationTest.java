package Services.ServicesImplementation;

import model.Person;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import static org.junit.jupiter.api.Assertions.*;

class NonTeachingTaskImplementationTest {
    Person security = new Person("Arnold","Smith", 52, "male", "Security");
    Person chef = new Person("Marie","Mayer", 34, "female", "Chef");
    Person cleaner = new Person("George","Adetoye", 22, "male", "Cleaner");
    NonTeachingTaskImplementation nonTeachingTaskImplementation = new NonTeachingTaskImplementation();


    @Test
    void cookMeals() throws NoPermissionException {
        assertEquals("Chef Marie Mayer has prepared Beans.", nonTeachingTaskImplementation.cookMeals(chef, "Beans"));
    }

    @Test
    void cleanYard() throws NoPermissionException {
        assertEquals("Staff George Adetoye has cleaned the yard.", nonTeachingTaskImplementation.cleanYard(cleaner));
    }

    @Test
    void closeGates() throws NoPermissionException {
        assertEquals("Staff Arnold Smith has closed the gates.", nonTeachingTaskImplementation.closeGates(security));
    }
}