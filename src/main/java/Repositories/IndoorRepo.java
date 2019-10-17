package Repositories;

import Models.*;

import java.util.ArrayList;
import java.util.List;

public class IndoorRepo {

    private static IndoorRepo indoorRepo;

    List<Lamp> lamps;
    Temperature temperature;
    Stove stove;
    Radiator radiator;

    private IndoorRepo(){
        lamps = new ArrayList<>();
        temperature = new Temperature();
        stove = new Stove();
        radiator = new Radiator();
    }

    public static IndoorRepo getInstance(){
        if(indoorRepo==null){
            indoorRepo = new IndoorRepo();
        }
        return indoorRepo;
    }

    public Radiator getRadiator(){
        return radiator;
    }

    public List<Lamp> getLamps(){
        return lamps;
    }

    public int getLampSize(){
        return lamps.size();
    }

    public Stove getStove(){
        return stove;
    }

    public Temperature getTemperature(){
        return temperature;
    }
}
