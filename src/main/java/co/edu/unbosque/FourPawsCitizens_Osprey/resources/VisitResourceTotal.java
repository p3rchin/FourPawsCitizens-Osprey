package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VisitPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VisitService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Creating the resource of VisitTotal with @Path and  @Get notation
 */

@Path("/visits/total")
public class VisitResourceTotal {
    /**
     * This operation of Restful obtain the total of visits
     *
     * @return the total of visits.
     */

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total() {
        List<VisitPOJO> visits = new VisitService().listVisit();

        return Response.ok()
                .entity(visits)
                .build();
    }
}
