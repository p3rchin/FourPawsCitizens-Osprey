package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.VetRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.VetRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VetPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class VetService {

    VetRepository vetRepository;

    public List<VetPOJO> listVets() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        vetRepository = new VetRepositoryImpl(entityManager);
        List<Vet> vets = vetRepository.fyndAll();

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

    public Vet saveVets(String name, String adrress, String neightborhood) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        vetRepository = new VetRepositoryImpl(entityManager);

        Vet vet = new Vet(name, adrress, neightborhood);
        Vet persistedVet = vetRepository.save(vet).get();

        entityManager.close();
        entityManagerFactory.close();

        return persistedVet;
    }

    public void updateVet(Vet vet) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        vetRepository = new VetRepositoryImpl(entityManager);
        vetRepository.updateByUsername(vet.getName(), vet.getAddress(), vet.getNeighborhood(), vet.getUsername().getUsername());

        entityManager.close();
        entityManagerFactory.close();

    }

}