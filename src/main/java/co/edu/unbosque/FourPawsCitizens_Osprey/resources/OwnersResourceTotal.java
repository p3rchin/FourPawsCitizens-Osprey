//package co.edu.unbosque.FourPawsCitizens_Osprey.resources;
//
//import resources.pojos.Owner;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.util.ArrayList;
//import java.util.List;
//
//@Path("/users/{userName}/owner/total")
//public class OwnersResourceTotal {
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response total(@PathParam("userName") String userName) {
//
//        List<Owner> owners = new ArrayList<Owner>();
//        owners.add(new Owner(userName, 1, "Felipe Rojas", "Calle 74a # 65b - 61", "San Felipe"));
//        owners.add(new Owner(userName, 2, "Paula Buitrago", "Calle 47a # 104b - 23", "San Pedro"));
//        owners.add(new Owner(userName, 3, "Ricardo Cuevas", "Carrera 6 N° 17 - 90", "San Felipe"));
//
//        int sanFelipe = 0;
//        int sanPedro = 0;
//
//        for (int i = 0; i < owners.size(); i++) {
//
//            if (owners.get(i).getNeighborhood().equals("San Felipe")) {
//
//                sanFelipe++;
//            } else if (owners.get(i).getNeighborhood().equals("San Pedro")) {
//                sanPedro++;
//            }
//        }
//
//        return Response.ok()
//                .entity("El total de Prpietarios es:" + owners.size() + "\nEl de propietarios de la localidad de San Felipe es:" + sanFelipe + "\nEl de propietarios de la localidad de San Pedro es:" + sanPedro)
//                .build();
//    }
//
//}
