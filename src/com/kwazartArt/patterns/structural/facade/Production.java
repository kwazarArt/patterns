package com.kwazartArt.patterns.structural.facade;

public class Production {
    private boolean activeConveyor;

    public boolean isActiveConveyor() {
        return activeConveyor;
    }

    public void startConveyor() {
        System.out.println("Conveyor is active.");
        activeConveyor = true;
    }

    public void finishConveyor() {
        System.out.println("Conveyor is not active.");
        activeConveyor = false;
    }
}
