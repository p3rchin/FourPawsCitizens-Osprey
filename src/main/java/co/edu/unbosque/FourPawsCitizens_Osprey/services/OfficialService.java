package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OfficialRepository;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OfficialRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.OwnerRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OfficialPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class OfficialService {

    OfficialRepository officialRepository;

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

    public Official saveOfficial(String name) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        officialRepository = new OfficialRepositoryImpl(entityManager);

        Official official = new Official(name);
        Official persistedOfficial = officialRepository.save(official).get();

        entityManager.close();
        entityManagerFactory.close();

        return persistedOfficial;
    }

}