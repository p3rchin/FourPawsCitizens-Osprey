package co.edu.unbosque.FourPawsCitizens_Osprey.resources;

import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Osprey.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.OwnerService;
import co.edu.unbosque.FourPawsCitizens_Osprey.services.PetService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * Creating the resource of pet with @Path and  @Post notation
 */
@Path("/owners/{username}/pets")
public class PetResource {
    /**
     * This operation of Restful create the pet
     *
     * @param username is the nickname of the owner.ownerId!=null, ownerId!=" "
     * @param pet     is the occupation of the user. pet!=null
     * @return the object pet created.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(@PathParam("username") String username, Pet pet) {
        Optional<Pet> persistedPet = new PetService().savePet(username, pet);
        if (persistedPet.isPresent()) {
            return Response.status(Response.Status.CREATED)
                    .entity(persistedPet.get()).build();
        } else {
            return Response.serverError()
                    .entity("Pet could not be created")
                    .build();
        }
    }
}
