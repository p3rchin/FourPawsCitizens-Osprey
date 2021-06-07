package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Case;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;

import java.util.List;
import java.util.Optional;

public interface CaseRepository {


    Optional<Case> findById(Integer id);

    List<Case> findAll();

    Optional<Case> save(Case Case);

}
