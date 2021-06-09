package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class OwnerService {

    OwnerRepository ownerRepository;

    public List<OwnerPOJO> listOwners() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);
        List<Owner> owners = ownerRepository.fyndAll();

        entityManager.close();
        entityManagerFactory.close();

        List<OwnerPOJO> ownersPOJO = new ArrayList<>();
        for (Owner owner : owners) {
            ownersPOJO.add(new OwnerPOJO(
                    owner.getOwnerId(),
                    owner.getUsername().getUsername(),
                    owner.getPersonId(),
                    owner.getName(),
                    owner.getAddress(),
                    owner.getNeighborhood()
            ));
        }

        return ownersPOJO;
    }

    public Owner saveOwner(String name, String adrress, String neightborhood) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        ownerRepository = new OwnerRepositoryImpl(entityManager);

        Owner owner = new Owner(name, adrress, neightborhood);
        Owner persistedOwner = ownerRepository.save(owner).get();

        entityManager.close();
        entityManagerFactory.close();

        return persistedOwner;
    }

    public void updateAuthor(Owner owner) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);
        ownerRepository.updateByUsername(owner.getName(), owner.getAddress(), owner.getNeighborhood(), owner.getUsername().getUsername());

        entityManager.close();
        entityManagerFactory.close();

    }

}