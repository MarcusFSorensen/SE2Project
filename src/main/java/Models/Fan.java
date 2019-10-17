package Models;

public class Fan {

    private boolean isOn;
    private int voltage;
    private int timer;
    private boolean isSwinging;

    public Fan(){

    }

    public Fan(boolean isOn, int voltage, int timer, boolean isSwinging){
        this.isOn = isOn;
        this.voltage = voltage;
        this.timer = timer;
        this.isSwinging = isSwinging;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public boolean isSwinging() {
        return isSwinging;
    }

    public void setSwinging(boolean swinging) {
        isSwinging = swinging;
    }
}
