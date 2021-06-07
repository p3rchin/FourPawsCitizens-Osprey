package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class PetRepositoryImpl implements PetRepository {

    private EntityManager entityManager;

    public Optional<Pet> fyndById(String Id) {
        Pet pet = entityManager.find(Pet.class, Id);
        return pet != null ? Optional.of(pet) : Optional.empty();
    }


    public List<Pet> fyndAll() {
        return entityManager.createQuery("from Pet").getResultList();
    }


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
