package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


/**
 * Creating the resource of official with @Path and  @Get notation
 */

@Path("/owners/total/{param}")
public class OwnersResourceTotal {

    /**
     * This operation of Restful obtain the total of owners
     *
     * @param param are the parameters that have the owner.param!=null,param!=" "
     * @return the total of owners
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@PathParam("param") String param) {

        List<OwnerPOJO> owners = new OwnerService().listOwners();
        List<OwnerPOJO> ownersParam = new ArrayList<>();
        for (int i = 0; i < owners.size(); i++) {
            if (param.equals(owners.get(i).getOwnerId()) || param.equals(owners.get(i).getUsername()) || param.equals("" + owners.get(i).getPersonId()) || param.equals(owners.get(i).getName()) || param.equals(owners.get(i).getAddress()) || param.equals(owners.get(i).getNeighborhood())) {
                ownersParam.add(owners.get(i));
            }
        }
        return Response.ok()
                .entity(ownersParam)
                .build();
    }
}
