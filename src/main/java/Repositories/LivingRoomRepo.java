package Repositories;

import Models.Lamp;

import java.util.ArrayList;
import java.util.List;

public class LivingRoomRepo {

    private static LivingRoomRepo livingRoom;

    List<Lamp> lamps;

    private LivingRoomRepo(){

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
}
