package com.kwazartArt.patterns.behavioral.command;

public class DesignCommand implements Command {
    PowerChargeProduction powerChargeProduction;

    public DesignCommand(PowerChargeProduction powerChargeProduction) {
        this.powerChargeProduction = powerChargeProduction;
    }

    @Override
    public void execute() {
        powerChargeProduction.design();
    }
}
