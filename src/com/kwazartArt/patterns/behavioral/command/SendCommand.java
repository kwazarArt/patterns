package com.kwazartArt.patterns.behavioral.command;

public class SendCommand implements Command {
    PowerChargeProduction powerChargeProduction;

    public SendCommand(PowerChargeProduction powerChargeProduction) {
        this.powerChargeProduction = powerChargeProduction;
    }

    @Override
    public void execute() {
        powerChargeProduction.send();
    }
}
