package book.observer;


import java.util.HashSet;
import java.util.Set;

public class Subject {

    private Set<Observer> observers = new HashSet<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    protected void notify(Entity entity, Event event){
        for (Observer observer: observers){
            observer.onNotify(entity, event);
        }
    }
}
