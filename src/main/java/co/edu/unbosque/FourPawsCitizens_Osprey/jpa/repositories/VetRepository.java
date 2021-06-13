package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;

import java.util.List;
import java.util.Optional;

/**
 * Creating VetRepository interface with methods
 */
public interface VetRepository {

    /**
     * Creating method fyndByUsername
     *
     * @param username is the nickname for the Vet. username!=null, username!=" "
     * @return the Vet.
     */
    Optional<Vet> findByUsername(String username);

    /**
     * Creating method findAll
     *
     * @return All the Vets.
     */
    List<Vet> findAll();


    /**
     * Creating method save the Vet
     *
     * @param Vet object of the Vet. Vet!=null.
     * @return the Vet
     */
    Optional<Vet> save(Vet Vet);

    /**
     * Creating method to udpdate an Owner
     *
     * @param username     is the username of the owner. Username!=null, Username!=" "
     * @param password     is the key that has the user that open the program. password != null, username!=" "
     * @param email        is the @ that has the user. email != null, email != " "
     * @param name         is the name of the owner. name!=null, name!=" "
     * @param address      is the addres of the owner. address!=null, address!=" "
     * @param neighborhood is the neighborhood. neighborhood!=null, neighborhood!=" "
     */
    void updateByUsername(String username, String password, String email, String name, String address, String neighborhood);


}
