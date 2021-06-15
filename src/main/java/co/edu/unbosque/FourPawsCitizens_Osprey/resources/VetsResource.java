package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VetService;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vets/{username}")
public class VetsResource {

    /**
     * This operation of Restful modify the owner
     *
     * @param username is the nickname of the owner. userName!=null,userName!=" ".
     * @param vet    is the occupation of the user. owner!=null
     * @return owner modified.
     */
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Vet vet) {

     VetService vetService = new VetService();

     vetService.updateVet(username,vet);

        return Response.ok()
                .entity(vet)
                .build();
    }
}
