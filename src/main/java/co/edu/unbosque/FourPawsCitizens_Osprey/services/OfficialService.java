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
                    official.getUsername(),
                    official.getPassword(),
                    official.getEmail(),
                    official.getName()
            ));
        }

        return officialsPOJO;
    }

    /**
     * Creating method saveOfficial
     *
     * @param officialPOJO is the nickname for the UserApp. Username!=null, Username!=" "
     * @return an Official
     */
    public Optional<OfficialPOJO> createofficial(OfficialPOJO officialPOJO) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        officialRepository = new OfficialRepositoryImpl(entityManager);

        Official official = new Official(officialPOJO.getUsername(), officialPOJO.getPassword(), officialPOJO.getEmail(), officialPOJO.getName());
        Optional<Official> persistedOfficial = officialRepository.save(official);

        entityManager.close();
        entityManagerFactory.close();

        if (persistedOfficial.isPresent()) {
            return Optional.of(new OfficialPOJO(persistedOfficial.get().getUsername(),
                    persistedOfficial.get().getPassword(),
                    persistedOfficial.get().getEmail(),
                    persistedOfficial.get().getName()));
        } else {
            return Optional.empty();
        }

    }

}