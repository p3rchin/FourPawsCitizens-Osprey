package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating VetRepositoryImpl with methods
 */
public class VetRepositoryImpl implements VetRepository {

    private EntityManager entityManager;

    /**
     * Creating the default constructor
     *
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public VetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method fyndByUsername
     *
     * @param vetId is the username for the Vet. Username!=null, Username!=" "
     * @return the Vet.
     */
    public Optional<Vet> findById(Integer vetId) {
        Vet vet = entityManager.find(Vet.class, vetId);
        return vet != null ? Optional.of(vet) : Optional.empty();
    }

    /**
     * Creating method findAll
     *
     * @return All the Vets.
     */
    public List<Vet> findAll() {
        return entityManager.createQuery("from Vet").getResultList();
    }


    /**
     * Creating method to udpdate an Vet
     *
     * @param name         is the name of the Vet. name!=null, name!=" "
     * @param address      is the addres of the Vet. address!=null, address!=" "
     * @param neighborhood is the neighborhood. neighborhood!=null, neighborhood!=" "
     * @param Username     is the username of the Vet. Username!=null, Username!=" "
     */
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

    /**
     * Creating method save the Vet
     *
     * @param Vet object of the Vet. Vet!=null.
     * @return the Vet
     */
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
