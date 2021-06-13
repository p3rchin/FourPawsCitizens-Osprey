package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.VetPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VetService;
import org.jboss.resteasy.annotations.Query;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of vet with @Path and  @Get notation
 */
@Path("/vets/total")
public class VetsResourceFilter {
    /**
     * This operation of Restful obtain the total of vets
     *
     * @param param are the parameters that have the owner.param!=null,param!=" "
     * @return the total of pets.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@QueryParam("param") String param) {

        List<VetPOJO> vets = new VetService().listVets();
        List<VetPOJO> vetsParam = new ArrayList<>();

        if (param != null) {
            for (int i = 0; i < vets.size(); i++) {
                if (param.equals(vets.get(i).getUsername()) || param.equals(vets.get(i).getPassword()) || param.equals(vets.get(i).getEmail()) || param.equals(vets.get(i).getName()) || param.equals(vets.get(i).getAddress()) || param.equals(vets.get(i).getNeighborhood())) {
                    vetsParam.add(vets.get(i));
                }
            }
        } else {
            vetsParam = vets;
        }

        return Response.ok()
                .entity(vetsParam)
                .build();
    }
}
