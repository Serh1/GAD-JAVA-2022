package Proiect.Observer;

import javax.swing.*;
import java.awt.*;
/*
* Temperature sensor monitoring app.
* */


public class SensorApp extends JFrame {
    SensorApp(ViewSensor sview){
        setLayout(new BorderLayout());
        add(sview,BorderLayout.NORTH);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Sensor s = new Sensor();
        s.start();
        ViewSensor sview = new ViewSensor();
        ControllerSensor scontroller = new ControllerSensor(s,sview);
        new SensorApp(sview);
    }
}
