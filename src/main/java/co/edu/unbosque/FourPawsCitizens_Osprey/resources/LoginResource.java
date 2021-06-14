package co.edu.unbosque.FourPawsCitizens_Osprey.resources;


import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.UserApp;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.filters.Logged;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.UserAppPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VetPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.UserAppService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Creating the resource of LoginResource with @Path,@Get and @Post notation
 */
@Path("/owners/login")
public class LoginResource {

    /**
     * This operation of Restful verify the owner
     *
     * @param owner is the occupation of the user. owner!=null
     * @return Verify the role.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create2(OwnerPOJO owner) {

        List<String> role = new ArrayList<>();
        try{
            UserApp userApp = new UserAppService().Authorization(owner.getUsername());

            if (userApp != null) {
                if (owner.getUsername().equals(userApp.getUsername()) && owner.getPassword().equals(userApp.getPassword())) {
                   role.add(userApp.getRole());
                    return Response.status(Response.Status.ACCEPTED)
                            .entity(role).build();
                } else {
                    role.add("Invalid password");
                    return Response.serverError()
                            .entity(role)
                            .build();
                }
            } else {
                role.add("Username was not founded");
                return Response.serverError()
                        .entity(role)
                        .build();
            }
        }catch (Exception e){
            role.add("Username was not founded");
            return Response.serverError()
                    .entity(role)
                    .build();
        }
    }
}
