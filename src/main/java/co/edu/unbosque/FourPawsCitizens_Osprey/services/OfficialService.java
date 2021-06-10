package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.*;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OfficialPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating OfficialService with methods
 */
@Stateless
public class OfficialService {

    OfficialRepository officialRepository;
    UserAppRepository userAppRepository;

    /**
     * Creating method listOfficial
     *
     * @return A list of Pojos of Officials
     */
    public List<OfficialPOJO> listOfficial() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        officialRepository = new OfficialRepositoryImpl(entityManager);
        List<Official> officials = officialRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<OfficialPOJO> officialsPOJO = new ArrayList<>();
        for (Official official : officials) {
            officialsPOJO.add(new OfficialPOJO(
                    official.getOfficialId(),
                    official.getUsername().getUsername(),
                    official.getName()
            ));
        }

        return officialsPOJO;
    }

    /**
     * Creating method saveOfficial
     *
     * @param official is the occupation of the user. official!=null
     * @param username is the nickname for the UserApp. Username!=null, Username!=" "
     * @return an Official
     */
    public Optional<Official> saveOfficial(Official official, String username) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);
        officialRepository = new OfficialRepositoryImpl(entityManager);

        UserApp userApp = userAppRepository.findByUsername(username).get();
        Official officialDb = new Official(official.getOfficialId(), official.getName());
        officialDb.setUsername(userApp);
        Optional<Official> persistedOwner = officialRepository.save(officialDb);

        entityManager.close();
        entityManagerFactory.close();

        return persistedOwner;
    }

}