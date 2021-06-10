package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.UserAppRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.UserAppRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.VetRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.VetRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VetPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating VetService with methods
 */
@Stateless
public class VetService {

    UserAppRepository userAppRepository;
    VetRepository vetRepository;

    /**
     * Creating method listVets
     *
     * @return A list of Pojos of Vets
     */
    public List<VetPOJO> listVets() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        vetRepository = new VetRepositoryImpl(entityManager);
        List<Vet> vets = vetRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<VetPOJO> vetsPOJO = new ArrayList<>();
        for (Vet vet : vets) {
            vetsPOJO.add(new VetPOJO(
                    vet.getVetId(),
                    vet.getUsername().getUsername(),
                    vet.getName(),
                    vet.getAddress(),
                    vet.getNeighborhood()
            ));
        }

        return vetsPOJO;
    }

    /**
     * Creating method saveVets
     *
     * @param vet is the occupation of the user. vet!=null
     * @param username is the nickname for the UserApp. Username!=null, Username!=" "
     * @return an Vet
     */
    public Optional<Vet> saveVets(Vet vet, String username) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);
        vetRepository = new VetRepositoryImpl(entityManager);


        UserApp userApp = userAppRepository.findByUsername(username).get();
        Vet vetDb = new Vet(vet.getVetId(), vet.getName(), vet.getAddress(), vet.getNeighborhood());
        vetDb.setUsername(userApp);
        Optional<Vet> persistedOwner = vetRepository.save(vetDb);

        entityManager.close();
        entityManagerFactory.close();

        return persistedOwner;
    }

    /**
     * Creating method updateVet
     *
     * @param vet is the occupation of the user. vet!=null
     */
    public void updateVet(Vet vet) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        vetRepository = new VetRepositoryImpl(entityManager);
        vetRepository.updateByUsername(vet.getName(), vet.getAddress(), vet.getNeighborhood(), vet.getUsername().getUsername());

        entityManager.close();
        entityManagerFactory.close();

    }

}