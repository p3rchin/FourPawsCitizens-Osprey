package co.edu.unbosque.FourPawsCitizens_Osprey.services;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Visit;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories.*;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VisitPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating VisitService with methods
 */
@Stateless
public class VisitService {

    VisitRepository visitRepository;
    VetRepository vetRepository;

    /**
     * Creating method listVisit
     *
     * @return A list of Pojos of Visits
     */
    public List<VisitPOJO> listVisit() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        visitRepository = new VisitRepositoryImpl(entityManager);
        List<Visit> visits = visitRepository.fyndAll();

        entityManager.close();
        entityManagerFactory.close();

        List<VisitPOJO> visitsPOJO = new ArrayList<>();
        for (Visit visit : visits) {
            visitsPOJO.add(new VisitPOJO(
                    visit.getVisit_id(),
                    visit.getCreated_at(),
                    visit.getType(),
                    visit.getDescription(),
                    visit.getUsername().getUsername(),
                    visit.getPet().getPetId()
            ));
        }

        return visitsPOJO;
    }

    /**
     * Creating method saveVisit
     *
     * @param username is the nickname of the vet. username!=null, username!=" "
     * @param visit is the visit for a pet created by a vet. visit!=null
     * @return an visit
     */
    public void saveVisit(String username, Visit visit) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        vetRepository = new VetRepositoryImpl(entityManager);
        visitRepository = new VisitRepositoryImpl(entityManager);

        Optional<Vet> vet = vetRepository.findByUsername(username);
        Vet vet1 = vet.get();
        vet.ifPresent(a -> {
            Visit visitDb = new Visit(visit.getVisit_id(), visit.getCreated_at(), visit.getType(), visit.getDescription(), visit.getPet());
            visitDb.setUsername(vet1);
            a.addVisit(visitDb);
            vetRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();
        return;
    }
}