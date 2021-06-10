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

@Stateless
public class VisitService {

    VisitRepository visitRepository;
    VetRepository vetRepository;

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
                    visit.getVet().getVetId(),
                    visit.getPet().getPetId()
            ));
        }

        return visitsPOJO;
    }

    public void saveVisit(String username, Visit visit) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("OspreyDS");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        vetRepository = new VetRepositoryImpl(entityManager);
        visitRepository = new VisitRepositoryImpl(entityManager);

        Optional<Vet> vet = vetRepository.fyndByUsername(username);
        vet.ifPresent(a -> {
            a.addVisit(new Visit(visit.getVisit_id(), visit.getCreated_at(), visit.getType(), visit.getDescription(), visit.getVet(), visit.getPet()));
            vetRepository.save(a);
        });

        entityManager.close();
        entityManagerFactory.close();
        return;
    }
}