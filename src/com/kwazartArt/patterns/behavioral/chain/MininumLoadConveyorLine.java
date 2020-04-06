package com.kwazartArt.patterns.behavioral.chain;

public class MininumLoadConveyorLine extends ConveyorLine {

    public MininumLoadConveyorLine(int load) {
        super(load);
    }

    @Override
    public void production(String command) {
        System.out.println("Conveyor line is active because of minimum load. Order: " + command);
    }
}
