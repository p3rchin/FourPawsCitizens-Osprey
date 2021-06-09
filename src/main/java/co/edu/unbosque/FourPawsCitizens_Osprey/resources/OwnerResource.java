//package co.edu.unbosque.FourPawsCitizens_Osprey.resources;
//
//
//import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.OwnerPOJO;
//import co.edu.unbosque.FourPawsCitizens_Osprey.resources.pojos.PetPOJO;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.util.ArrayList;
//import java.util.List;
//
//@Path("/users/{userName}/owner")
//public class OwnerResource {
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response list(@PathParam("userName") String userName) {
//
//        List<PetPOJO> pets = new ArrayList<PetPOJO>();
//        List<PetPOJO> pets2 = new ArrayList<PetPOJO>();
//        List<PetPOJO> pets3 = new ArrayList<PetPOJO>();
//
//        //pets.add(new PetPOJO(1, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 1));
//        //pets.add(new PetPOJO(2, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", 1));
//
//        //pets2.add(new PetPOJO(3, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 2));
//        //pets2.add(new PetPOJO(4, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", 2));
//
//        //pets3.add(new PetPOJO(5, "10as1d1a0d", "Iván Duque", "títere", "No se sabe", "pequeño", "no se sabe", "foto", 3));
//        //pets3.add(new PetPOJO(6, "Robinson Pirse", "Perro", "Dalmata", "Mediano", "Hembra", "foto2", 3));
//
////        List<PetPOJO> owners = new ArrayList<PetPOJO>();
////        owners.add(new PetPOJO(userName, 1, "Felipe Rojas", "Calle 74a # 65b - 61", "San Felipe", pets));
////        owners.add(new PetPOJO(userName, 2, "Paula Buitrago", "Calle 47a # 104b - 23", "San Pedro", pets2));
////        owners.add(new PetPOJO(userName, 3, "Ricardo Cuevas", "Carrera 6 N° 17 - 90", "San Felipe", pets3));
//
//        return Response.ok()
//                .entity(owners2)
//                .build();
//    }
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response list(@PathParam("userName") Integer vet_Id) {
//        List<OwnerPOJO> owners = new ArrayList<OwnerPOJO>();
//        visits.add(new Visit(5, "home", "felino", "good healthy", vet_Id, pet_Id));
//        visits.add(new Visit(6, "home2", "canino", "death virus", vet_Id, pet_Id));
//        visits.add(new Visit(7, "home3", "canino", "without balls and ovaries", vet_Id, pet_Id));
//        visits.add(new Visit(8, "home4", "felino", "good healthy", vet_Id, pet_Id));
//
//        return Response.ok()
//                .entity(visits)
//                .build();
//    }
//
//
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response create(@PathParam("userName") String userName, Owner owner) {
//        owner.setUser(userName);
//        owner.setPerson_Id(1);
//        return Response.status(Response.Status.CREATED)
//                .entity(owner)
//                .build();
//    }
//
//}
