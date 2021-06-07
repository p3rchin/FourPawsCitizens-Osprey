package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;

import java.util.List;
import java.util.Optional;

/**
 * Creating OfficialRepository interface with methods
 */
public interface OfficialRepository {

    /**
     * Creating method fyndByUsername
     * @param Username is the username for the Official. Username!=null, Username!=" "
     * @return the Username
     */
    Optional<Official> fyndByUsername(String Username);

    /**
     * Creating method findAll
     * @return All the Officials
     */
    List<Official> findAll();

    /**
     * Creating method save the Official
     * @param official object of the official. official!=null.
     * @return the official saved
     */
    Optional<Official> save(Official official);

}
