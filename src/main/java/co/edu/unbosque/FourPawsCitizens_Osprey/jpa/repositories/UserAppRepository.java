package co.edu.unbosque.FourPawsCitizens_Osprey.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;

import java.util.List;
import java.util.Optional;

public interface UserAppRepository {

    Optional<UserApp> fyndByUsername(String Username);

    List<UserApp> findAll();

    Optional<UserApp> save(UserApp userApp);

}
