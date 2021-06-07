package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;

import java.util.List;
import java.util.Optional;

public interface VetRepository {


    Optional<Vet> fyndByUsername(String Username);
    List<Vet> fyndAll();
    void updateByUsername(String name, String address, String neighborhood,String Username);
    Optional<Vet> save(Vet Vet);

}
