package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class UserAppRepositoryImpl implements UserAppRepository{

    private EntityManager entityManager;

    public Optional<UserApp> fyndByUsername(String Username) {
        UserApp userApp = entityManager.find(UserApp.class, Username);
        return userApp != null ? Optional.of(userApp) : Optional.empty();
    }

    public List<UserApp> findAll() {
        return entityManager.createQuery("from UserApp").getResultList();
    }

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
