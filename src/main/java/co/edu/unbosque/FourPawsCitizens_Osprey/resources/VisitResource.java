package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Visit;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VisitService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/vets/{vet_id}/visits")
public class VisitResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("vet_id") Integer vetId, Visit visit) {
        VisitService visitService = new VisitService();
        visitService.saveVisit(vetId, visit);

        return Response.status(Response.Status.CREATED)
                .entity(visit).build();

    }
}
