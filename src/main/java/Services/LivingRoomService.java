package Services;

import Models.Lamp;
import Models.Room;
import Repositories.LivingRoomRepo;

import java.util.List;

public class LivingRoomService {
    private LivingRoomRepo livingRoom = LivingRoomRepo.getInstance();

    public List<Room> getRooms(){

        return  livingRoom.getRooms();

    }
    public Room getRoom(int id){
        Room room = null;

        for (Room r: livingRoom.getRooms()){
            if (r.getId()==id){
                room = r;
            }
        }return room;
    }

    public List<Lamp> getLamps(int roomId){

        List<Room> rooms = livingRoom.getRooms();
        List<Lamp> lamps = null;
        for(Room r: rooms){
            if (r.getId()==roomId){
                lamps = r.getLampList();
            }
        }
        return lamps;
    }

    public Lamp getLamp(int roomId, int lampId){

        List<Lamp> lamps = getLamps(roomId);
        Lamp lamp = null;


        for(Lamp l: lamps){
            if(l.getId()==lampId){
                lamp = l;
            }
        }
        return lamp;
    }

    public Boolean updateLamp( int roomId, Lamp lamp){
        Boolean isUpdated = false;
        List<Room> rooms = livingRoom.getRooms();

        for (int i = 0; i < livingRoom.getLampSize(); i++) {
            if (rooms.get(i).getId() == roomId)
            if(livingRoom.getLamps().get(i).getId()==lamp.getId()){
                livingRoom.getLamps().set(i, lamp);
                isUpdated = true;
            }
        }
        return isUpdated;
    }
    public Room addRoom(Room room){
        livingRoom.getRooms().add(room);
        return room;
    }
    public Lamp addLamp(int roomId, Lamp lamp){
        List<Lamp> lamps = null;
        List<Room> rooms = livingRoom.getRooms();

        for (int i = 0; i<livingRoom.getRoomSize(); i++){

            if (rooms.get(i).getId() == roomId){
                lamps= rooms.get(i).getLampList();
                lamp.setId((lamps.size())+1);
                rooms.get(i).getLampList().add(lamp);
            }
        }return lamp;
    }

}
