package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements IObservable {
    private List<IObserver> observers = new ArrayList<IObserver>();
    private String headline;

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(headline);
        }
    }

    public void setHeadline(String headline) {
        this.headline = headline;
        notifyObservers();
    }
}
