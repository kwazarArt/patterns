package com.kwazartArt.patterns.behavioral.command;

public class ProductionRunner {
    public static void main(String[] args) {
        PowerChargeProduction powerChargeProduction = new PowerChargeProduction();

        Employee employee = new Employee(
                new DesignCommand(powerChargeProduction),
                new CreateCommand(powerChargeProduction),
                new PackCommand(powerChargeProduction),
                new SendCommand(powerChargeProduction)
        );

        employee.designPowerCharge();
        employee.createPowerCharge();
        employee.packPowerCharge();
        employee.sendPowerCharge();
    }
}
