package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;


/**
 * Creating the resource of owner with @Path and  @Get notation
 */

@Path("/owners/total")
public class OwnersResourceFilter {

    /**
     * This operation of Restful obtain the total of owners
     *
     * @param param are the parameters that have the owner.param!=null,param!=" "
     * @return the total of owners
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@QueryParam("param") String param) {

        List<OwnerPOJO> owners = new OwnerService().listOwners();
        List<OwnerPOJO> ownersParam = new ArrayList<>();

        if (param != null) {
            for (int i = 0; i < owners.size(); i++) {
                if (param.equals(owners.get(i).getUsername()) || param.equals(owners.get(i).getPassword()) || param.equals("" + owners.get(i).getPersonId()) || param.equals(owners.get(i).getEmail()) || param.equals(owners.get(i).getName()) || param.equals(owners.get(i).getAddress()) || param.equals(owners.get(i).getNeighborhood())) {
                    ownersParam.add(owners.get(i));
                }
            }
        } else {
            ownersParam = owners;
        }

        return Response.ok()
                .entity(ownersParam)
                .build();
    }
}
