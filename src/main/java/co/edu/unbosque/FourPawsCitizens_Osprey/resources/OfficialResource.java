package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Official;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OfficialService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * Creating the resource of official with @Path and  @Post notation
 */
@Path("/users/{userName}/officials")
public class OfficialResource {

    /**
     * This operation of Restful create the official
     *
     * @param username is the nickname of the official. username!=null,username!=" "
     * @param official is the occupation of the user. official!=null
     * @return the object official created.
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String username, Official official) {
        Optional<Official> persistedOfficial = new OfficialService().saveOfficial(official, username);
        if (persistedOfficial.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedOfficial.get()).build();
        } else {
            return Response.serverError()
                    .entity("Official user could not be created")
                    .build();
        }
    }
}
