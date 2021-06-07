package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository {

    Optional<Owner> fyndByUsername(String Owner);
    List<Owner> fyndAll();
    void updateByUsername(String name, String address, String neighborhood,String Username);
    Optional<Owner> save(Owner Owner);

}
