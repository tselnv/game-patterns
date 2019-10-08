package book.observer_from_wiki;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractSubject implements Subject {

    protected Set<Observer> observerSet = new HashSet<>();

    @Override
    public void addObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerSet.remove(observer);
    }
}
