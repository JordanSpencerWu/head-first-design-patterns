package design.pattern.observer;

/**
 * Created by Jordan on 8/27/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
