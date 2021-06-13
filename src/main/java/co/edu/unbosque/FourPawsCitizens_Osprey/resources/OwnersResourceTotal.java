package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Creating the resource of owner with @Path and  @Get notation
 */
@Path("/owners/total")
public class OwnersResourceTotal {
    /**
     * This operation of Restful obtain the total of owners
     * @return the total of owners
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total() {

        List<OwnerPOJO> owners = new OwnerService().listOwners();

        return Response.ok()
                .entity(owners)
                .build();
    }
}
