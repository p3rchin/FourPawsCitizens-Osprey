package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.PetRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.PetRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Stateless
public class PetService {

    PetRepository petRepository;
    OwnerRepository ownerRepository;

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
                    pet.getOwner().getOwnerId()
            ));
        }

        return petsPOJO;
    }

    public void savePet(String microchip, String name, String species, String raze, String size, String sex, String picture, String usernameOwner) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);
        petRepository = new PetRepositoryImpl(entityManager);

        Optional<Owner> owner = ownerRepository.fyndByUsername(usernameOwner);
        owner.ifPresent(a -> {
            a.addPet(new Pet(microchip, name, species, raze, size, sex, picture));
            ownerRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();
        return;
    }
}