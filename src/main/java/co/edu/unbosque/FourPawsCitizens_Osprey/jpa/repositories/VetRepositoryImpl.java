package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating VetRepositoryImpl with methods
 */
public class VetRepositoryImpl implements VetRepository {

    private EntityManager entityManager;

    /**
     * Creating the default constructor
     *
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public VetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method fyndByUsername
     *
     * @param username is the nickname for the Vet. username!=null, username!=" "
     * @return the Vet.
     */
    public Optional<Vet> findByUsername(String username) {
        Vet vet = entityManager.find(Vet.class, username);
        return vet != null ? Optional.of(vet) : Optional.empty();
    }

    /**
     * Creating method findAll
     *
     * @return All the Vets.
     */
    public List<Vet> findAll() {
        return entityManager.createQuery("from Vet").getResultList();
    }



    /**
     * Creating method save the Vet
     *
     * @param Vet object of the Vet. Vet!=null.
     * @return the Vet
     */
    public Optional<Vet> save(Vet Vet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(Vet);
            entityManager.getTransaction().commit();
            return Optional.of(Vet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
