package co.edu.unbosque.FourPawsCitizens_Osprey.resources;



import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users/{userName}/owners/{owner_id}")
public class OwnersResource {

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
