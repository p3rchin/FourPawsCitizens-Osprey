package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetCasePOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetCaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of PetCase with @Path and  @Get notation
 */
@Path("/petcases/total")
public class PetCaseResourceFilter {

    /**
     * This operation of Restful obtain the total of petcases
     *
     * @param param are the parameters that have the petcases.param!=null,param!=" ".
     * @return the total of petcases.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@QueryParam("param") String param) {

        List<PetCasePOJO> petcases = new PetCaseService().listPetsCase();
        List<PetCasePOJO> petcasesParam = new ArrayList<>();

        if (param != null) {
            for (int i = 0; i < petcases.size(); i++) {
                if (param.equals(petcases.get(i).getCreatedAt()) || param.equals(petcases.get(i).getDescription()) || param.equals(petcases.get(i).getType()) || param.equals(petcases.get(i).getPetId()) || param.equals(petcases.get(i).getCaseId())) {
                    petcasesParam.add(petcases.get(i));
                }
            }
        }else{
            petcasesParam = petcases;
        }

        return Response.ok()
                .entity(petcasesParam)
                .build();
    }
}
