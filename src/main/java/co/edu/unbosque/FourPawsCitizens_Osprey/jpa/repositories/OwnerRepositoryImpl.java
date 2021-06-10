package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating OwnerRepositoryImpl with methods
 */
public class OwnerRepositoryImpl implements OwnerRepository {


    private EntityManager entityManager;

    /**
     * Creating the default constructor
     *
     * @param entityManager it manage the database entities. entityManager!=null
     */

    public OwnerRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method fyndByUsername
     *
     * @param ownerId is the oid for the Owner. ownerId!=null, ownerId!=" "
     * @return the Owner
     */
    public Optional<Owner> findById(Integer ownerId) {
        Owner owner = entityManager.find(Owner.class, ownerId);
        return owner != null ? Optional.of(owner) : Optional.empty();
    }

    /**
     * Creating method findAll
     *
     * @return All the owners
     */
    public List<Owner> findAll() {
        return entityManager.createQuery("from Owner").getResultList();
    }

    /**
     * Creating method save the Owner
     *
     * @param owner object of the Owner. Owner!=null.
     * @return the Owner
     */

    public Optional<Owner> save(Owner owner) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(owner);
            entityManager.getTransaction().commit();
            return Optional.of(owner);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    /**
     * Creating method to udpdate an Owner
     *
     * @param name         is the name of the owner. name!=null, name!=" "
     * @param address      is the addres of the owner. address!=null, address!=" "
     * @param neighborhood is the neighborhood. neighborhood!=null, neighborhood!=" "
     * @param Username     is the username of the owner. Username!=null, Username!=" "
     * @param personId     is the number to identify a person, personId!=null, personId!=" "
     */
    public void updateByUsername(String name, String address, String neighborhood, String Username, Integer personId) {
        Owner owner = entityManager.find(Owner.class, Username);
        if (owner != null) {
            try {
                entityManager.getTransaction().begin();
                owner.setName(name);
                owner.setAddress(address);
                owner.setPersonId(personId);
                owner.setNeighborhood(neighborhood);
                entityManager.merge(owner);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
