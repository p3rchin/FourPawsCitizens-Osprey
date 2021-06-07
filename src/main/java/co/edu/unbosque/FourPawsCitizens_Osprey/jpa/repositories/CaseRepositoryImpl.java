package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Casee;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating CaseRepositoryImpl with methods
 */
public class CaseRepositoryImpl implements CaseRepository {


    private EntityManager entityManager;


    /**
     * Creating the default constructor
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public CaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method findById
     * @param id is the id number for the case. id!=null, id!=" "
     * @return the case
     */
    public Optional<Casee> findById(Integer id) {
        Casee Case = entityManager.find(Casee.class, id);
        return Case != null ? Optional.of(Case) : Optional.empty();
    }

    /**
     * Creating method findAll
     * @return All the cases
     */
    public List<Casee> findAll() {
        return entityManager.createQuery("from Casee").getResultList();
    }


    /**
     * Creating method save the case
     * @param Case object of the case. Case!=null.
     * @return the case saved
     */
    public Optional<Casee> save(Casee Case) {
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
