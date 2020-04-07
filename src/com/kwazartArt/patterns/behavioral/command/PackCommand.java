package com.kwazartArt.patterns.behavioral.command;

public class PackCommand implements Command {
    PowerChargeProduction powerChargeProduction;

    public PackCommand(PowerChargeProduction powerChargeProduction) {
        this.powerChargeProduction = powerChargeProduction;
    }

    @Override
    public void execute() {
        powerChargeProduction.pack();
    }
}
