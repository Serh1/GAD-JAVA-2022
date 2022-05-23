package Lecture3_DesignPatterns.Ch4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {
    private List<Observer> observers;

    public Teacher() {
        observers = new ArrayList<>();
    }

    public void teach(String topic) {
        notifyObservers(topic);
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer ob : observers)
            ob.update(message);
    }
}
