package co.edu.unbosque.FourPawsCitizens_Osprey.resources;


import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.filters.Logged;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.UserAppPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.UserAppService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.Optional;

/**
 * Creating the resource of OwnerLoginResource with @Path,@Get and @Post notation
 */
@Path("/owners")
public class OwnerResource {

    /**
     * TThis operation of Restful obtain the owner logged
     *
     * @param role is the occupation of the user. role!=null, role!=" ".
     * @return the owner logged.
     */
    @Logged
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello(@HeaderParam("role") String role) {

        // If role doesn't match
        if (!"owner".equals(role))
            return Response.status(Response.Status.FORBIDDEN)
                    .entity("Role " + role + " cannot access to this method")
                    .build();

        return Response.ok()
                .entity("Hello, World, " + role + "!")
                .build();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create2(OwnerPOJO owner) {

        UserApp userApp = new UserAppService().Authorization(owner.getUsername());

        if (userApp != null) {
            if (owner.getUsername().equals(userApp.getUsername()) && owner.getPassword().equals(userApp.getPassword())) {
                return Response.status(Response.Status.CREATED)
                        .entity(userApp.getRole()).build();
            } else {
                return Response.serverError()
                        .entity("Invalid password")
                        .build();
            }
        } else {
            return Response.serverError()
                    .entity("Username was not founded")
                    .build();
        }


    }

    /**
     * This operation of Restful create the owner
     *
     * @param owner is the occupation of the user. owner!=null
     * @return the object owner created.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(OwnerPOJO owner) {
        Optional<OwnerPOJO> persistedOwner = new OwnerService().createOwner(owner);
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
