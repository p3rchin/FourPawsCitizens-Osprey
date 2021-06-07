package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Visit;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating VisitRepositoryImpl with methods
 */
public class VisitRepositoryImpl implements VisitRepository {


    private EntityManager entityManager;

    /**
     * Creating the default constructor
     *
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public VisitRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method findById
     *
     * @param Id is the id number for the Visit. id!=null, id!=" "
     * @return the Visit
     */
    public Optional<Visit> fyndById(String Id) {
        Visit visit = entityManager.find(Visit.class, Id);
        return visit != null ? Optional.of(visit) : Optional.empty();
    }

    /**
     * Creating method findAll
     *
     * @return All the Visit
     */
    public List<Visit> fyndAll() {
        return entityManager.createQuery("from Visit").getResultList();
    }

    /**
     * Creating method save the visit
     *
     * @param visit object of the visit. Case!=null.
     * @return the visit saved
     */

    public Optional<Visit> save(Visit visit) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(visit);
            entityManager.getTransaction().commit();
            return Optional.of(visit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
