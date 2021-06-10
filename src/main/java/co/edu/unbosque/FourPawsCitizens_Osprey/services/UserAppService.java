package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.UserAppRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.UserAppRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.UserAppPOJO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating the service for UserApp
 */
public class UserAppService {

    UserAppRepository userAppRepository;

    /**
     * this method list the Userapps in a pojo list
     * @return is the list of UserAppPOJO
     */
    public List<UserAppPOJO> listUserApps() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);
        List<UserApp> userApps = userAppRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<UserAppPOJO> userAppsPOJO = new ArrayList<>();
        for (UserApp userApp : userApps) {
            userAppsPOJO.add(new UserAppPOJO(
                    userApp.getUsername(),
                    userApp.getEmail(),
                    userApp.getPassword(),
                    userApp.getRole()
            ));
        }

        return userAppsPOJO;

    }

    /**
     * this method save the UserApp in the database
     * @param username is the username that identifies, username!=null, username!=" ".
     * @param password is the key word to get access, password!=null, password!=" ".
     * @param name     is the identification on the web, email!=null, email!=" ".
     * @param role     is the occupation of the person, role!=null, role!=" ".
     * @return
     */
    public UserApp saveUserApp(String username, String password, String name, String role) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);

        UserApp userApp = new UserApp(username, password, name, role);
        UserApp persistedUserApp = userAppRepository.save(userApp).get();

        entityManager.close();

        return persistedUserApp;

    }

    /**
     * this method validates the UserApp
     * @param username is the username that identifies, username!=null, username!=" ".
     * @param password is the key word to get access, password!=null, password!=" ".
     * @return the user role
     */
    public Optional<String> validateUser(String username, String password ) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Getting credentials from the database
        userAppRepository = new UserAppRepositoryImpl(entityManager);
        Optional<UserApp> user = userAppRepository.findByUsername(username);

        entityManager.close();
        entityManagerFactory.close();

        // Validating if credentials provided by the user are valid
        // If success, return the user role
        if (user.isPresent()) {
            if (user.get().getUsername().equals(username) && user.get().getPassword().equals(password)) {
                return Optional.of(user.get().getRole());
            }
        }

        return Optional.empty();

    }

    /**
     * this method create the user to login
     * @param user is the pojo object of UserApp
     * @return the pojo object of User
     */
    public Optional<UserAppPOJO> createUser(UserAppPOJO user) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);

        UserApp userApp = new UserApp(user.getUsername(), user.getPassword(), user.getEmail(), user.getRole());
        Optional<UserApp> persistedUserApp = userAppRepository.save(userApp);

        entityManager.close();
        entityManagerFactory.close();

        if (persistedUserApp.isPresent()) {
            return Optional.of(new UserAppPOJO(persistedUserApp.get().getUsername(),
                    persistedUserApp.get().getPassword(),
                    persistedUserApp.get().getEmail(),
                    persistedUserApp.get().getRole()));
        } else {
            return Optional.empty();
        }

    }
}
