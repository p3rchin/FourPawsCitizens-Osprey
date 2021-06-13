package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VetPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VetService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;
/**
 * Creating the resource of vet with @Path and  @Get notation
 */
@Path("/vets/total")
public class VetsResourceTotal {
    /**
     * This operation of Restful obtain the total of vets
     *
     * @return the total of pets.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total() {

        List<VetPOJO> vets = new VetService().listVets();

        return Response.ok()
                .entity(vets)
                .build();
    }
}
