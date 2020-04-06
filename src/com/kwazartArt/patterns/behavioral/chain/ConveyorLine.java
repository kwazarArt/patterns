package com.kwazartArt.patterns.behavioral.chain;

public abstract class ConveyorLine {
    private int load;
    private ConveyorLine nextConveyorLine;

    public ConveyorLine(int load) {
        this.load = load;
    }

    public void setNextConveyorLine(ConveyorLine nextConveyorLine) {
        this.nextConveyorLine = nextConveyorLine;
    }

    public void ControlPanelForConveyorLines(String command, int level) {
        if (level >= load) {
            production(command);
        }
        if (nextConveyorLine != null) {
            nextConveyorLine.ControlPanelForConveyorLines(command, level);
        }
    }

    public abstract void production(String command);
}
