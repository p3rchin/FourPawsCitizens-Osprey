package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetCasePOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetCaseService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of PetCase with @Path and  @Get notation
 */
@Path("/petcases/total/{param}")
public class PetCaseResourceTotal {

    /**
     * This operation of Restful obtain the total of petcases
     *
     * @param param are the parameters that have the petcases.param!=null,param!=" ".
     * @return the total of petcases.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@PathParam("param") String param) {

        List<PetCasePOJO> petcases = new PetCaseService().listPetsCase();
        List<PetCasePOJO> petcasesParam = new ArrayList<>();
        for (int i = 0; i < petcases.size(); i++) {
            if (param.equals(petcases.get(i).getCreatedAt()) || param.equals(petcases.get(i).getDescription()) || param.equals(petcases.get(i).getType()) || param.equals(petcases.get(i).getPetId()) || param.equals(petcases.get(i).getCaseId())) {
                petcasesParam.add(petcases.get(i));
            }
        }
        return Response.ok()
                .entity(petcasesParam)
                .build();
    }

}
