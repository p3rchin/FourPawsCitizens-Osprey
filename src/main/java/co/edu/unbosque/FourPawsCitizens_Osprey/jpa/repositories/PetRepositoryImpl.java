package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating PetRepositoryImpl with methods
 */
public class PetRepositoryImpl implements PetRepository {

    private EntityManager entityManager;

    /**
     * Creating the default constructor
     *
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public PetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method findById
     *
     * @param Id is the id number for the Pet. Id!=null, Id!=" "
     * @return the Pet
     */


    public Optional<Pet> fyndById(Integer Id) {
        Pet pet = entityManager.find(Pet.class, Id);
        return pet != null ? Optional.of(pet) : Optional.empty();
    }

    /**
     * Creating method findAll
     *
     * @return All the Pet
     */

    public List<Pet> fyndAll() {
        return entityManager.createQuery("from Pet").getResultList();
    }

    /**
     * Creating method save the pet
     *
     * @param pet object of the pet. pet!=null.
     * @return the pet saved
     */
    public Optional<Pet> save(Pet pet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pet);
            entityManager.getTransaction().commit();
            return Optional.of(pet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();

    }
}
