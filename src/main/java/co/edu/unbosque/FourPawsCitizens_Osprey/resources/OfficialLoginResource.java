package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.filters.Logged;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.UserAppPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.UserAppService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * Creating the OfficialLoginResource with @Path, @Get and @Post notation
 */
@Path("/officials")
public class OfficialLoginResource {
    /**
     *  This operation of Restful obtain the official logged
     * @param role is the occupation of the user. role!=null, role!=" ".
     * @return the official logged.
     */
    @Logged
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello(@HeaderParam("role") String role) {

        if (!"official".equals(role))
            return Response.status(Response.Status.FORBIDDEN)
                    .entity("Role " + role + " cannot access to this method")
                    .build();

        return Response.ok()
                .entity("Hello, World, " + role + "!")
                .build();

    }

    /**
     *  This operation of Restful create the official user
     * @param user is the object type of user  to login. user!=null
     * @return the official user created.
     */

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(UserAppPOJO user) {
        user.setRole("official");
        Optional<UserAppPOJO> persistedUser = new UserAppService().createUser(user);

        if (persistedUser.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedUser.get())
                    .build();
        } else {
            return Response.serverError()
                    .entity("Official user could not be created")
                    .build();
        }
    }
}
