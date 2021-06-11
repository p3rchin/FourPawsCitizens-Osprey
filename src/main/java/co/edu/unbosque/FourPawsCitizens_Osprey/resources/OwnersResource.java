package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Creating the resource of official with @Path and  @Put notation
 */

@Path("/owners/{username}")
public class OwnersResource {

    /**
     * This operation of Restful modify the owner
     *
     * @param username is the nickname of the owner. userName!=null,userName!=" ".
     * @param owner    is the occupation of the user. owner!=null
     * @return owner modified.
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Owner owner) {

        OwnerService ownerService = new OwnerService();
        ownerService.updateOwner(username,owner);

        return Response.ok()
                .entity(owner)
                .build();
    }


}
