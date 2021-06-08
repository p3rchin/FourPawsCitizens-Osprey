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
}
