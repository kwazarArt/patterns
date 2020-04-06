package com.kwazartArt.patterns.structural.proxy;

public class RealPowerCharge implements PowerCharge {
    private String ideaName;

    public RealPowerCharge(String ideaName) {
        this.ideaName = ideaName;
        createIdea();
    }

    public void createIdea() {
        System.out.println("Creating idea for future " + ideaName + " power charge prototype...");
    }

    @Override
    public void create() {
        System.out.println("Creating " + ideaName + " power charge...");
    }
}
