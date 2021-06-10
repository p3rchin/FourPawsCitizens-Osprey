package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.UserAppRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.UserAppRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating OwnerService with methods
 */
@Stateless
public class OwnerService {
    UserAppRepository userAppRepository;
    OwnerRepository ownerRepository;

    /**
     * Creating method listOwners
     *
     * @return A list of Pojos of Owners
     */
    public List<OwnerPOJO> listOwners() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);
        List<Owner> owners = ownerRepository.findAll();

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

    /**
     * Creating method saveOwner
     *
     * @param owner is the occupation of the user. owner!=null
     * @param username is the nickname for the UserApp. Username!=null, Username!=" "
     * @return an Owner
     */
    public Optional<Owner> saveOwner(Owner owner, String username) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);
        userAppRepository = new UserAppRepositoryImpl(entityManager);

        UserApp userApp = userAppRepository.findByUsername(username).get();
        Owner ownerDb = new Owner(owner.getOwnerId(), owner.getPersonId(), owner.getName(), owner.getAddress(), owner.getNeighborhood());
        ownerDb.setUsername(userApp);
        Optional<Owner> persistedOwner = ownerRepository.save(ownerDb);

        entityManager.close();
        entityManagerFactory.close();

        return persistedOwner;
    }

    /**
     * Creating method updateOwner
     *
     * @param owner is the occupation of the user. owner!=null
     */
    public void updateOwner(Owner owner) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        ownerRepository = new OwnerRepositoryImpl(entityManager);
        ownerRepository.updateByUsername(owner.getName(), owner.getAddress(), owner.getNeighborhood(), owner.getUsername().getUsername(), owner.getPersonId());

        entityManager.close();
        entityManagerFactory.close();

    }

}