package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetCasePOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetCaseService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Creating the resource of PetCase with @Path and  @Get notation
 */
@Path("/petcases/total")
public class PetCaseResourceTotal {

    /**
     * This operation of Restful obtain the total of petcases
     * @return the total of petcases.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total() {

        List<PetCasePOJO> petcases = new PetCaseService().listPetsCase();

        return Response.ok()
                .entity(petcases)
                .build();
    }
}
