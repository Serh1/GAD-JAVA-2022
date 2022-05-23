package Proiect.Observer;

public class ControllerSensor {
    Sensor s;
    ViewSensor sview;
    public ControllerSensor(Sensor s, ViewSensor sview){
        s.addObserver(sview);
        this.s = s;
        this.sview = sview;
    }
}
