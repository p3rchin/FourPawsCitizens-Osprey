package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;

import java.util.List;
import java.util.Optional;

/**
 * Creating OwnerRepository interface with methods
 */
public interface OwnerRepository {

    /**
     * Creating method fyndByUsername
     * @param username is the id for the Owner. username!=null, username!=" "
     * @return the Owner
     */
    Optional<Owner> findByUsername(String username);
    /**
     * Creating method findAll
     * @return All the owners
     */
    List<Owner> findAll();

    /**
     *  Creating method to udpdate an Owner
     * @param username is the username of the owner. Username!=null, Username!=" "
     * @param password     is the key that has the user that open the program. password != null, username!=" "
     * @param email        is the @ that has the user. email != null, email != " "
     * @param personId     is the number to identify a person, personId!=null, personId!=" "
     * @param name         is the name of the owner. name!=null, name!=" "
     * @param address      is the addres of the owner. address!=null, address!=" "
     * @param neighborhood is the neighborhood. neighborhood!=null, neighborhood!=" "
     */
    void updateByUsername(String username, String password, String email,Integer personId, String name, String address, String neighborhood);

    /**
     * Creating method save the Owner
     * @param Owner object of the Owner. Owner!=null.
     * @return the Owner
     */
    Optional<Owner> save(Owner Owner);

}
