package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.UserAppPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.UserAppService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * Creating the resource of owner with @Path and  @Post notation
 */
@Path("/users/{userName}/owners")
public class OwnerResource {

    /**
     * This operation of Restful create the owner
     *
     * @param username is the nickname of the owner. username!=null,username!=" "
     * @param owner    is the occupation of the user. owner!=null
     * @return the object owner created.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String username, Owner owner) {
        Optional<Owner> persistedOwner = new OwnerService().saveOwner(owner, username);
        if (persistedOwner.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedOwner.get()).build();
        } else {
            return Response.serverError()
                    .entity("Owner user could not be created")
                    .build();
        }
    }


}
