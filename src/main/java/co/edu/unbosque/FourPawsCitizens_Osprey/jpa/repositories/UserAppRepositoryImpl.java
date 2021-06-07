package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Creating UserAppRepositoryImpl with methods
 */
public class UserAppRepositoryImpl implements UserAppRepository {

    private EntityManager entityManager;

    /**
     * Creating the default constructor
     *
     * @param entityManager it manage the database entities. entityManager!=null
     */
    public UserAppRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Creating method fyndByUsername
     *
     * @param Username is the username for the UserApp. Username!=null, Username!=" "
     * @return the UserApp
     */
    public Optional<UserApp> fyndByUsername(String Username) {
        UserApp userApp = entityManager.find(UserApp.class, Username);
        return userApp != null ? Optional.of(userApp) : Optional.empty();
    }

    /**
     * Creating method findAll
     *
     * @return All the UserApps
     */
    public List<UserApp> findAll() {
        return entityManager.createQuery("from UserApp").getResultList();
    }

    /**
     * Creating method save the UserApp
     *
     * @param userApp object of the UserApp. UserApp!=null.
     * @return the UserApp saved
     */
    public Optional<UserApp> save(UserApp userApp) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(userApp);
            entityManager.getTransaction().commit();
            return Optional.of(userApp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
