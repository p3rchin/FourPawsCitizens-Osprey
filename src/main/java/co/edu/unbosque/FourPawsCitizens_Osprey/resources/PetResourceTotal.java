package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetPOJO;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Creating the resource of pet with @Path and  @Get notation
 */

@Path("/pets/total/{param}")
public class PetResourceTotal {


    /**
     * This operation of Restful obtain the total of pets
     *
     * @param param param are the parameters that have the owner.param!=null,param!=" "
     * @return the total of pets.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response total(@PathParam("param") String param) {

        List<PetPOJO> pets = new PetService().listPets();
        List<PetPOJO> petsParam = new ArrayList<>();
        for (int i = 0; i < pets.size(); i++) {
            if (param.equals(pets.get(i).getName()) || param.equals(pets.get(i).getMicrochip()) || param.equals(pets.get(i).getPetId()) || param.equals(pets.get(i).getUsername()) || param.equals(pets.get(i).getPicture()) || param.equals(pets.get(i).getRace()) || param.equals(pets.get(i).getSex()) || param.equals(pets.get(i).getSize()) || param.equals(pets.get(i).getSpecies())) {
                petsParam.add(pets.get(i));
            }
        }
        return Response.ok()
                .entity(petsParam)
                .build();
    }
}
