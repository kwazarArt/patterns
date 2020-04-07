package com.kwazartArt.patterns.behavioral.command;

public class CreateCommand implements Command {
    PowerChargeProduction powerChargeProduction;

    public CreateCommand(PowerChargeProduction powerChargeProduction) {
        this.powerChargeProduction = powerChargeProduction;
    }

    @Override
    public void execute() {
        powerChargeProduction.create();
    }
}
