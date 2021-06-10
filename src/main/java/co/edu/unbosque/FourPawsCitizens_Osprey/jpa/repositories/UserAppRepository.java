package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;

import java.util.List;
import java.util.Optional;

/**
 * Creating UserAppRepository interface with methods
 */
public interface UserAppRepository {

    /**
     * Creating method fyndByUsername
     * @param Username is the username for the UserApp. Username!=null, Username!=" "
     * @return the UserApp
     */
    Optional<UserApp> findByUsername(String Username);

    /**
     * Creating method fyndByUsername2
     * @param Username is the username for the UserApp. Username!=null, Username!=" "
     * @return the UserApp
     */
    UserApp fyndByUsername2(String Username);

    /**
     * Creating method findAll
     * @return All the UserApps
     */
    List<UserApp> findAll();

    /**
     * Creating method save the UserApp
     * @param userApp object of the UserApp. UserApp!=null.
     * @return the UserApp saved
     */
    Optional<UserApp> save(UserApp userApp);

}
