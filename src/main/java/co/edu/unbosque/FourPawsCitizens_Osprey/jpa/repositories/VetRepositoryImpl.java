package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class VetRepositoryImpl implements VetRepository {

    private EntityManager entityManager;

    public Optional<Vet> fyndByUsername(String Username) {
        Vet vet = entityManager.find(Vet.class, Username);
        return vet != null ? Optional.of(vet) : Optional.empty();
    }

    public List<Vet> fyndAll() {
        return entityManager.createQuery("from Vet").getResultList();
    }


    public void updateByUsername(String name, String address, String neighborhood, String Username) {
        Vet vet = entityManager.find(Vet.class, Username);
        if (vet != null) {
            try {
                entityManager.getTransaction().begin();
                vet.setName(name);
                vet.setAddress(address);
                vet.setNeighborhood(neighborhood);
                entityManager.merge(vet);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Optional<Vet> save(Vet Vet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(Vet);
            entityManager.getTransaction().commit();
            return Optional.of(Vet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
