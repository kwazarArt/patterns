package com.kwazartArt.patterns.behavioral.chain;

public class HardLoadConveyorLine extends ConveyorLine {
    public HardLoadConveyorLine(int load) {
        super(load);
    }

    @Override
    public void production(String command) {
        System.out.println("Conveyor line is active because of high load. Order: " + command);
    }
}
