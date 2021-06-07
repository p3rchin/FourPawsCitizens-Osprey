package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Casee;

import java.util.List;
import java.util.Optional;

/**
 * Creating CaseRepository interface with methods
 */
public interface CaseRepository {

    /**
     * Creating method findById
     * @param id is the id number for the case. id!=null, id!=" "
     * @return the case
     */
    Optional<Casee> findById(Integer id);

    /**
     * Creating method findAll
     * @return All the cases
     */
    List<Casee> findAll();

    /**
     * Creating method save the case
     * @param Case object of the case. Case!=null.
     * @return the case saved
     */
    Optional<Casee> save(Casee Case);

}
