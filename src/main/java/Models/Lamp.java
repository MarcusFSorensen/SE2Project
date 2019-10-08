package Models;

public class Lamp {
    private int Id;
    private Boolean isOn;
    private double voltage;

    public Lamp(int Id, Boolean isOn, double voltage){
        this.Id = Id;
        this.isOn = isOn;
        this.voltage = voltage;
    }

    public int getId() {
        return Id;
    }

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
}
