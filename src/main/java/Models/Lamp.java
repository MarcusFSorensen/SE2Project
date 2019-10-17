package Models;

public class Lamp {
    private int Id;
    private Boolean isOn;
    private double voltage;
    private int roomId;

    public Lamp(int Id, Boolean isOn, double voltage,int roomId){
        this.Id = Id;
        this.isOn = isOn;
        this.voltage = voltage;
        this.roomId = roomId;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id){this.Id = Id;}


    public Lamp(){

    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
