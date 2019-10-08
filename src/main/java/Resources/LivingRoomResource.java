package Resources;


import Models.Lamp;
import Models.Room;
import Repositories.LivingRoomRepo;
import Services.LivingRoomService;
import jdk.nashorn.internal.objects.annotations.Getter;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/livingroom")
public class LivingRoomResource {

    LivingRoomService livingRoomService = new LivingRoomService();

    @GET
    @Produces
    public List<Room> getRooms(){
        return  livingRoomService.getRooms();
    }

    @GET
    @Path("/{id}")
    @Produces
    public Room getRoom(int id){
        return livingRoomService.getRoom(id);
    }

    @GET
    @Path("/lamps")
    @Produces
    @Consumes
    public Response getLamps(int roomId) {
        List<Lamp> lamps = livingRoomService.getLamps(roomId);

        if (lamps == null) {
            return Response.status(400).entity("There is no lamps registered").build();
        } else {
            return Response.ok().entity(lamps).build();
        }
    }

    @GET
    @Path("/lamps/{lampId}")
    @Produces
    @Consumes
    public Response getLamp(@PathParam("lampId")int roomId, int lampId) {

        Lamp lamp = livingRoomService.getLamp(roomId, lampId);
        if (lamp == null) {
            return Response.status(400).entity("There is no lamp registered with that id").build();
        } else {
            GenericEntity<Lamp> entity = new GenericEntity<>(lamp, Lamp.class);
            return Response.ok().entity(entity).build();
        }
    }

    @PUT
    @Consumes
    @Produces
    public Response updateLamp(int roomId, Lamp lamp){

        Boolean isUpdated = livingRoomService.updateLamp(roomId,lamp);
        if(isUpdated) {
            return Response.ok().entity("Lamp was updated").build();
        } else {
            return Response.status(400).entity("There is no lamp registered with that Id").build();
        }
    }
    @POST
    @Consumes
    @Produces
    public Room addRoom(Room room){
        return livingRoomService.addRoom(room);
    }
}