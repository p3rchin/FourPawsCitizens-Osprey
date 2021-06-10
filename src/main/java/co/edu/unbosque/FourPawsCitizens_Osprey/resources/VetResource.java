package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Vet;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.VetService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * Creating the resource of vet with @Path and  @Post notation
 */
@Path("/users/{userName}/vets")
public class VetResource {


    /**
     * This operation of Restful create the vet
     *
     * @param username is the nickname of the owner. username!=null,username!=" "
     * @param vet      is the occupation of the user. vet!=null
     * @return the object vet created.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("userName") String username, Vet vet) {
        Optional<Vet> persistedVet = new VetService().saveVets(vet, username);

        if (persistedVet.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedVet.get()).build();
        } else {
            return Response.serverError()
                    .entity("Vet user could not be created")
                    .build();
        }
    }
}
