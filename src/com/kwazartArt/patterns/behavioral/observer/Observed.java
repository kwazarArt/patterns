package com.kwazartArt.patterns.behavioral.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void removeObsserver(Observer observer);

    public void notifyObservers();
}
