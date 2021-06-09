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

@Stateless
public class PetCaseService {

    PetCaseRepository petCaseRepository;
    PetRepository petRepository;

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

    public void savePetCase(String created_at, String type, String description, Integer IdOwner) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        petRepository = new PetRepositoryImpl(entityManager);
        petCaseRepository = new PetCaseRepositoryImpl(entityManager);

        Optional<Pet> pet = petRepository.fyndById(IdOwner);
        pet.ifPresent(a -> {
            a.addPetCase(new PetCase(created_at, type, description));
            petRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();
        return;
    }
}