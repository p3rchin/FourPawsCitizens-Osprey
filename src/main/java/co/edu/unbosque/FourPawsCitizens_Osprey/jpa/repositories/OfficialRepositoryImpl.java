package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Case;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating CaseRepositoryImpl with methods
 */

public class OfficialRepositoryImpl implements OfficialRepository {

    private EntityManager entityManager;

    /**
     * Creating the default constructor
     *
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public OfficialRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method fyndByUsername
     *
     * @param Username is the username for the Official. Username!=null, Username!=" "
     * @return the Username
     */
    public Optional<Official> fyndByUsername(String Username) {
        Official official = entityManager.find(Official.class, Username);
        return official != null ? Optional.of(official) : Optional.empty();
    }

    /**
     * Creating method findAll
     *
     * @return All the Officials
     */
    public List<Official> findAll() {
        return entityManager.createQuery("from Official").getResultList();
    }

    /**
     * Creating method save the Official
     *
     * @param official object of the official. official!=null.
     * @return the official saved
     */
    public Optional<Official> save(Official official) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(official);
            entityManager.getTransaction().commit();
            return Optional.of(official);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
