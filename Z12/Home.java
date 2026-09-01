package practice_15.Z12;

public class Home {

    Light light;
    Conditioner conditioner;
    SystemIB systemIB;

    public Home() {
        this.light = new Light();
        this.conditioner = new Conditioner();
        this.systemIB = new SystemIB();
    }

    public void lightOn() {
        light.lightOn();
    }

    public void lightOff() {
        light.lightOff();
    }

    public void conditionerOn() {
        conditioner.conditionerOn();
    }

    public void conditionerOff() {
        conditioner.conditionerOff();
    }

    public void systemOn() {
        systemIB.systemOn();
    }

    public void systemOff() {
        systemIB.systemOff();
    }
}

