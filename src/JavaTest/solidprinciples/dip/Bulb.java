package JavaTest.solidprinciples.dip;

public class Bulb {
}

// Wrong

/*
class LightBulb { void turnOn() { } void turnOff() { } }

class Switch {
    private LightBulb bulb;
    Switch() { bulb = new LightBulb(); }
    void operate() { bulb.turnOn(); }
}

 */


/////Right

/*

interface Switchable { void turnOn(); void turnOff(); }

class LightBulb implements Switchable { ... }

class Switch {
    private Switchable device;
    Switch(Switchable device) { this.device = device; }
    void operate() { device.turnOn(); }
}


 */