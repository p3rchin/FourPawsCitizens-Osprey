package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

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
     * @param username is the nickname for the Vet. username!=null, username!=" "
     * @return the Vet.
     */
    public Optional<Vet> findByUsername(String username) {
        Vet vet = entityManager.find(Vet.class, username);
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

    /**
     *  Creating method to udpdate an Owner
     * @param username is the username of the vet. Username!=null, Username!=" "
     * @param password     is the key that has the user that open the program. password != null, username!=" "
     * @param email        is the @ that has the user. email != null, email != " "
     * @param name         is the name of the vet. name!=null, name!=" "
     * @param address      is the addres of the vet. address!=null, address!=" "
     * @param neighborhood is the neighborhood. neighborhood!=null, neighborhood!=" "
     */
    @Override
    public void updateByUsername(String username, String password, String email, String name, String address, String neighborhood) {
        Vet vet = entityManager.find(Vet.class, username);
        if (vet != null) {
            try {
                entityManager.getTransaction().begin();
                vet.setPassword(password);
                vet.setEmail(email);
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
}

