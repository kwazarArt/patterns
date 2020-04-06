package com.kwazartArt.patterns.behavioral.chain;

public class Production {
    public static void main(String[] args) {
        ConveyorLine conveyorLineMinimal = new MininumLoadConveyorLine(Load.MINIMUM);
        ConveyorLine conveyorLineMedium = new MediumLoadConveyorLine(Load.MEDIUM);
        ConveyorLine conveyorLineHard = new HardLoadConveyorLine(Load.HARD);

        conveyorLineMinimal.setNextConveyorLine(conveyorLineMedium);
        conveyorLineMedium.setNextConveyorLine(conveyorLineHard);

        conveyorLineMinimal.ControlPanelForConveyorLines("Small order", Load.MINIMUM);
        conveyorLineMinimal.ControlPanelForConveyorLines("Common order", Load.MEDIUM);
        conveyorLineMinimal.ControlPanelForConveyorLines("Big order", Load.HARD);
    }
}
