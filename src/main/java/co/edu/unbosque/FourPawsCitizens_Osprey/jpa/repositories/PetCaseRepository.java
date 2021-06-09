package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.PetCase;

import java.util.List;
import java.util.Optional;


/**
 * Creating PetCaseRepository interface with methods
 */
public interface PetCaseRepository {

    /**
     * Creating method findById
     * @param id is the id number for the case. id!=null, id!=" "
     * @return the case
     */
    Optional<PetCase> findById(Integer id);

    /**
     * Creating method findAll
     * @return All the cases
     */
    List<PetCase> findAll();

    /**
     * Creating method save the case
     * @param Case object of the case. Case!=null.
     * @return the case saved
     */
    Optional<PetCase> save(PetCase Case);

}

