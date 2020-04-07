package com.kwazartArt.patterns.behavioral.observer;

public class PanelOmniTracker {
    public static void main(String[] args) {
        OmniTracker omniTracker = new OmniTracker();

        omniTracker.addTask("Create e-mail");
        omniTracker.addTask("Do backup");
        omniTracker.addTask("Create password");

        Observer employee1 = new Employee("NameOne");
        Observer employee2 = new Employee("NameTwo");

        omniTracker.addObserver(employee1);
        omniTracker.addObserver(employee2);

        omniTracker.addTask("Go lanch");

    }
}
