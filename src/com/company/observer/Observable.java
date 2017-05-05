package com.company.observer;

/**
 * Created by admin on 04.05.2017.
 */
public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
}
