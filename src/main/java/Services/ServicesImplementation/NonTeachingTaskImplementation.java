package Services.ServicesImplementation;

import Services.NonTeachingTasks;
import model.Person;

import javax.naming.NoPermissionException;

public class NonTeachingTaskImplementation implements NonTeachingTasks {

    /**
     * cookMeals method helps chef to prepare meals
     * @param chef
     * @param foodName
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String cookMeals(Person chef, String foodName) throws NoPermissionException {
        if (chef.getRole()!=null && chef.getRole().equals("Chef")){
            return "Chef " + chef.getFullName() + " has prepared " + foodName + ".";
        }
        else {
            throw new NoPermissionException("Only person's with the Chef role can prepare meals!");
        }
    }

    /**
     * cleanYard method helps cleaner to clean the yard
     * @param cleaner
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String cleanYard(Person cleaner) throws NoPermissionException {
        if (cleaner.getRole()!=null && cleaner.getRole().equals("Cleaner")){
            return "Staff " + cleaner.getFullName() + " has cleaned the yard.";
        }
        else {
            throw new NoPermissionException("Only person's with the Cleaner role can clean the yard!");
        }
    }

    /**
     * closeGates helps the security to know when to close the gates
     * @param security
     * @return
     * @throws NoPermissionException
     */
    @Override
    public String closeGates(Person security) throws NoPermissionException {
        if (security.getRole()!=null && security.getRole().equals("Security")){
            return "Staff " + security.getFullName() + " has closed the gates.";
        }
        else {
            throw new NoPermissionException("Only person's with the security role can close the gates!");
        }
    }
}
