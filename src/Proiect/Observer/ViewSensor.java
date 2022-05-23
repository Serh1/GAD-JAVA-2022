package Proiect.Observer;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class ViewSensor extends JPanel implements Observer {
    JTextField textTemp;
    JLabel textLabel;
    ViewSensor(){
        this.setLayout(new FlowLayout());
        textTemp = new JTextField(20);
        textLabel = new JLabel("Temperature: ");
        add(textLabel); add(textTemp);
    }

    public void update(Observable o, Object arg) {
        String s = ""+((Sensor)o).getTemperature();
        System.out.println("The new temperature is: "+ s);
        textTemp.setText(s);
    }

}
