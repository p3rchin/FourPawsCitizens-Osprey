package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
/**
 * Creating the resource of pet with @Path and  @Get notation
 */
@Path("/pets/total")
public class PetResourceTotal {

    /**
     * This operation of Restful obtain the total of pets
     *
     * @return the total of pets.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total() {

        List<PetPOJO> pets = new PetService().listPets();


        return Response.ok()
                .entity(pets)
                .build();
    }
}
