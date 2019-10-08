package Resources;


import Models.Lamp;
import Repositories.LivingRoomRepo;
import Services.LivingRoomService;

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
    @Path("/lamps")
    @Produces
    @Consumes
    public Response getLamps() {
        List<Lamp> lamps = livingRoomService.getLamps();

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
    public Response getLamp(@PathParam("lampId") int lampId) {

        Lamp lamp = livingRoomService.getLamp(lampId);
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
    public Response updateLamp(Lamp lamp){

        Boolean isUpdated = livingRoomService.updateLamp(lamp);
        if(isUpdated) {
            return Response.ok().entity("Lamp was updated").build();
        } else {
            return Response.status(400).entity("There is no lamp registered with that Id").build();
        }
    }
}