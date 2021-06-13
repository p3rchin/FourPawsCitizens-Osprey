package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VisitPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VisitService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of VisitTotal with @Path and  @Get notation
 */

@Path("/visits/total")
public class VisitResourceFilter {

    /**
     * This operation of Restful obtain the total of visits
     *
     * @param param are the parameters that have the visits.param!=null,param!=" ".
     * @return the total of visits.
     */

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@QueryParam("username") String param) {

        List<VisitPOJO> visits = new VisitService().listVisit();
        List<VisitPOJO> visitsParam = new ArrayList<>();

        if (param != null) {
            for (int i = 0; i < visits.size(); i++) {
                if (param.equals(param.equals(visits.get(i).getUsername()))){
                    visitsParam.add(visits.get(i));
                }
            }
        } else {
            visitsParam = visits;
        }

        return Response.ok()
                .entity(visitsParam)
                .build();
    }
}
