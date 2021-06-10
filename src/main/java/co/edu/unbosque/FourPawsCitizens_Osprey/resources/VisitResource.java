package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Visit;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OfficialService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VisitService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/vets/{username}/visits")
public class VisitResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("username")  String username, Visit visit) {
        Optional<Visit> persistedVisit = new VisitService().saveVisit(username,visit);
        if (persistedVisit.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedVisit.get()).build();
        } else {
            return Response.serverError()
                    .entity("Visit could not be created")
                    .build();
        }
    }
}
