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
     * @param ownerId is the id for the Owner. ownerId!=null, ownerId!=" "
     * @return the Owner
     */
    Optional<Owner> findById(Integer ownerId);
    /**
     * Creating method findAll
     * @return All the owners
     */
    List<Owner> findAll();

    /**
     * Creating method to udpdate an Owner
     * @param name is the name of the owner. name!=null, name!=" "
     * @param address is the addres of the owner. address!=null, address!=" "
     * @param neighborhood is the neighborhood. neighborhood!=null, neighborhood!=" "
     * @param Username is the username of the owner. Username!=null, Username!=" "
     */
    void updateByUsername(String name, String address, String neighborhood,String Username,Integer personId);

    /**
     * Creating method save the Owner
     * @param Owner object of the Owner. Owner!=null.
     * @return the Owner
     */
    Optional<Owner> save(Owner Owner);

}
