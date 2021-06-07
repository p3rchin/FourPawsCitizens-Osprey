package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Visit;

import java.util.List;
import java.util.Optional;

/**
 * Creating VisitRepository interface with methods
 */
public interface VisitRepository {
    /**
     * Creating method findById
     * @param Id is the id number for the Visit. id!=null, id!=" "
     * @return the Visit
     */
    Optional<Visit> fyndById(String Id);

    /**
     * Creating method findAll
     * @return All the Visit
     */
    List<Visit> fyndAll();
    /**
     * Creating method save the visit
     * @param visit object of the visit. Case!=null.
     * @return the visit saved
     */
    Optional<Visit> save( Visit visit);
}
