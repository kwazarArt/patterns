package com.kwazartArt.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class OmniTracker implements Observed {
    List<String> tasks = new ArrayList<>();
    List<Observer> employees = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public void removeTask(String task) {
        tasks.remove(task);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        employees.add(observer);
    }

    @Override
    public void removeObsserver(Observer observer) {
        employees.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : employees) {
            o.processTasks(this.tasks);
        }
    }
}
