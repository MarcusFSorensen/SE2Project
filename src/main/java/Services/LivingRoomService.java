package Services;

import Models.Lamp;
import Repositories.LivingRoomRepo;

import java.util.List;

public class LivingRoomService {
    private LivingRoomRepo livingRoom = LivingRoomRepo.getInstance();

    public List<Lamp> getLamps(){

        return livingRoom.getLamps();
    }

    public Lamp getLamp(int lampId){
        Lamp lamp = null;

        for(Lamp l: livingRoom.getLamps()){
            if(l.getId()==lampId){
                lamp = l;
            }
        }
        return lamp;
    }

    public Boolean updateLamp(Lamp lamp){
        Boolean isUpdated = false;
        for (int i = 0; i < livingRoom.getLampSize(); i++) {
            if(livingRoom.getLamps().get(i).getId()==lamp.getId()){
                livingRoom.getLamps().set(i, lamp);
                isUpdated = true;
            }
        }
        return isUpdated;
    }
}
