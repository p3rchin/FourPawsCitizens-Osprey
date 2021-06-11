package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.PetCase;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.PetRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.PetRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating PetService with methods
 */
@Stateless
public class PetService {

    PetRepository petRepository;
    OwnerRepository ownerRepository;

    /**
     * Creating method listPets
     *
     * @return A list of Pojos of Pets
     */
    public List<PetPOJO> listPets() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        petRepository = new PetRepositoryImpl(entityManager);
        List<Pet> pets = petRepository.fyndAll();

        entityManager.close();
        entityManagerFactory.close();

        List<PetPOJO> petsPOJO = new ArrayList<>();
        for (Pet pet : pets) {
            petsPOJO.add(new PetPOJO(
                    pet.getPetId(),
                    pet.getMicrochip(),
                    pet.getName(),
                    pet.getSpecies(),
                    pet.getRace(),
                    pet.getSize(),
                    pet.getSex(),
                    pet.getPicture(),
                    pet.getUsername().getUsername()
            ));
        }

        return petsPOJO;
    }

    /**
     * Creating method savePet
     *
     * @param username is the nickname of the owner. username!=null, username!=" "
     * @param pet is a pet of an owner. pet!=null
     * @return an pet
     */
    public void savePet(String username, Pet pet) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);
        petRepository = new PetRepositoryImpl(entityManager);

        Optional<Owner> owner = ownerRepository.findByUsername(username);
        Owner owner1 = owner.get();
        owner.ifPresent(a -> {
            Pet petDb = new Pet(pet.getPetId(), pet.getMicrochip(), pet.getName(), pet.getSpecies(), pet.getRace(), pet.getSize(), pet.getSex(), pet.getPicture());
            petDb.setUsername(owner1);
            a.addPet(petDb);
            ownerRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();

        return;
    }
}