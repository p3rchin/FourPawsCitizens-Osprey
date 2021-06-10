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
     * @param vetId is the username for the Vet. vetId!=null, vetId!=" "
     * @return the Vet.
     */
    Optional<Vet> findById(Integer vetId);

    /**
     * Creating method findAll
     *
     * @return All the Vets.
     */
    List<Vet> findAll();

    /**
     * Creating method to udpdate an Vet
     *
     * @param name         is the name of the Vet. name!=null, name!=" "
     * @param address      is the addres of the Vet. address!=null, address!=" "
     * @param neighborhood is the neighborhood. neighborhood!=null, neighborhood!=" "
     * @param Username     is the username of the Vet. Username!=null, Username!=" "
     */
    void updateByUsername(String name, String address, String neighborhood, String Username);

    /**
     * Creating method save the Vet
     *
     * @param Vet object of the Vet. Vet!=null.
     * @return the Vet
     */
    Optional<Vet> save(Vet Vet);

}
