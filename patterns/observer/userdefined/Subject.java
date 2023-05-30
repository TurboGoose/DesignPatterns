package observer.userdefined;

public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObservers();
}
