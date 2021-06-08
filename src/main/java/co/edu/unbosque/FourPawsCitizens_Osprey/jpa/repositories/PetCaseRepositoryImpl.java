package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.PetCase;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating CaseRepositoryImpl with methods
 */
public class PetCaseRepositoryImpl implements CaseRepository {


    private EntityManager entityManager;


    /**
     * Creating the default constructor
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public PetCaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method findById
     * @param id is the id number for the case. id!=null, id!=" "
     * @return the case
     */
    public Optional<PetCase> findById(Integer id) {
        PetCase Case = entityManager.find(PetCase.class, id);
        return Case != null ? Optional.of(Case) : Optional.empty();
    }

    /**
     * Creating method findAll
     * @return All the cases
     */
    public List<PetCase> findAll() {
        return entityManager.createQuery("from PetCase").getResultList();
    }


    /**
     * Creating method save the case
     * @param Case object of the case. Case!=null.
     * @return the case saved
     */
    public Optional<PetCase> save(PetCase Case) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(Case);
            entityManager.getTransaction().commit();
            return Optional.of(Case);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
