package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Creating the resource of official with @Path and  @Put notation
 */

@Path("/users/{userName}/owners/{owner_id}")
public class OwnersResource {

    /**
     * This operation of Restful modify the owner
     *
     * @param userName is the nickname of the owner. userName!=null,userName!=" ".
     * @param owner_Id is the id of the owner. owner_Id!=null,owner_Id!=" "
     * @param owner    is the occupation of the user. owner!=null
     * @return owner modified.
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("userName") String userName, @PathParam("owner_id") Integer owner_Id, Owner owner) {

        OwnerService ownerService = new OwnerService();
        ownerService.updateOwner(owner);

        return Response.ok()
                .entity(owner)
                .build();
    }


}
