package com.kwazartArt.patterns.behavioral.chain;

public class MediumLoadConveyorLine extends ConveyorLine {
    public MediumLoadConveyorLine(int load) {
        super(load);
    }

    @Override
    public void production(String command) {
        System.out.println("Conveyor line is active because of medium load. Order: " + command);
    }
}
