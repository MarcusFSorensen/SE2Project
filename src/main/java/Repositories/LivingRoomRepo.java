package Repositories;

import Models.Lamp;
import Models.Room;

import java.util.ArrayList;
import java.util.List;

public class LivingRoomRepo {

    private static LivingRoomRepo livingRoom;

    List<Lamp> lamps;
    List<Room> rooms;

    private LivingRoomRepo(){
        rooms = new ArrayList<>();
        lamps = new ArrayList<>();
    }


    public static LivingRoomRepo getInstance(){
        if(livingRoom==null){
            livingRoom = new LivingRoomRepo();
        }
        return livingRoom;
    }

    public List<Lamp> getLamps(){
        return lamps;
    }

    public int getLampSize(){
        return lamps.size();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public int getRoomSize(){
        return rooms.size();
    }
}
