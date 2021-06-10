package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.PetCase;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.*;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetCasePOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating PetCaseService with methods
 */
@Stateless
public class PetCaseService {

    PetCaseRepository petCaseRepository;
    PetRepository petRepository;

    /**
     * Creating method listPetsCase
     *
     * @return A list of Pojos of pet cases
     */
    public List<PetCasePOJO> listPetsCase() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        petCaseRepository = new PetCaseRepositoryImpl(entityManager);
        List<PetCase> petsCase = petCaseRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<PetCasePOJO> petsCasePOJO = new ArrayList<>();
        for (PetCase petCase : petsCase) {
            petsCasePOJO.add(new PetCasePOJO(
                    petCase.getCase_id(),
                    petCase.getCreated_at(),
                    petCase.getType(),
                    petCase.getDescription(),
                    petCase.getPet().getPetId()
            ));
        }

        return petsCasePOJO;
    }

    /**
     * Creating method savePetCase
     *
     * @param petCase is the case to threat the pet. petCase!=null
     * @param petId is the id of the pet. petId!=null, petId!=" "
     * @return an pet case
     */
    public void savePetCase(PetCase petCase, Integer petId) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        petRepository = new PetRepositoryImpl(entityManager);
        petCaseRepository = new PetCaseRepositoryImpl(entityManager);

        Optional<Pet> pet = petRepository.fyndById(petId);
        Pet pet1 = pet.get();
        pet.ifPresent(a -> {
            PetCase petCasedb = new PetCase(petCase.getCase_id(), petCase.getCreated_at(), petCase.getType(), petCase.getDescription());
            petCasedb.setPet(pet1);
            a.addPetCase(petCasedb);
            petRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();
        return;
    }
}