package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.PetCase;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OfficialService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetCaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;


@Path("/pets/{pet_id}/petcases")
public class PetCaseResource {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("pet_id") Integer petId, PetCase petCase) {
        PetCaseService petCaseService = new PetCaseService();
         petCaseService.savePetCase(petCase,petId);

            return Response.status(Response.Status.CREATED)
                    .entity(petCase).build();

    }
}
