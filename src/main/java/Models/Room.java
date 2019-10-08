package Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Room implements Serializable {
    private int id;
    private String name;
    private ArrayList<Lamp> lampList;

    public Room(){

    }

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Lamp> getLampList() {
        return lampList;
    }

    public void setLampList(ArrayList<Lamp> lampList) {
        this.lampList = lampList;
    }
}
