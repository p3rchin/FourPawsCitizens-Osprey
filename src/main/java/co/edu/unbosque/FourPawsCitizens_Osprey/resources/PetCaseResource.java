package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.PetCase;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OfficialService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetCaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;


@Path("/pets/{userName}/petCase")
public class PetCaseResource {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String username, PetCase petCase) {
        Optional<PetCase> persistedPetCase = new PetCaseService().savePetCase(username,petCase);
        if (persistedPetCase.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedPetCase.get()).build();
        } else {
            return Response.serverError()
                    .entity("Petcase could not be created")
                    .build();
        }
    }
}
