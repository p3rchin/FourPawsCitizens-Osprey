package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Case;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class CaseRepositoryImpl implements CaseRepository {

    private EntityManager entityManager;


    public CaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Case> findById(Integer id) {
        Case Case = entityManager.find(Case.class, id);
        return Case != null ? Optional.of(Case) : Optional.empty();
    }

    public List<Case> findAll() {
        return entityManager.createQuery("from Case").getResultList();
    }


    public Optional<Case> save(Case Case) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(Case);
            entityManager.getTransaction().commit();
            return Optional.of(Case);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
