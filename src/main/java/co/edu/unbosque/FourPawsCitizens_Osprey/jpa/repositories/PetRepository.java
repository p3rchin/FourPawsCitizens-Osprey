package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;

import java.util.List;
import java.util.Optional;

/**
 * Creating PetRepository interface with methods
 */
public interface PetRepository {
    /**
     * Creating method findById
     *
     * @param Id is the id number for the Pet. Id!=null, Id!=" "
     * @return the Pet
     */
    Optional<Pet> fyndById(String Id);

    /**
     * Creating method findAll
     *
     * @return All the Pet
     */
    List<Pet> fyndAll();

    /**
     * Creating method save the pet
     *
     * @param pet object of the pet. pet!=null.
     * @return the pet saved
     */
    Optional<Pet> save(Pet pet);
}
