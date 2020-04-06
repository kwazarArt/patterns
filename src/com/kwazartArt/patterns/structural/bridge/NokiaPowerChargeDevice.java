package com.kwazartArt.patterns.structural.bridge;

public class NokiaPowerChargeDevice extends Device {

    public NokiaPowerChargeDevice(Employee employee) {
        super(employee);
    }

    @Override
    public void createDevice() {
        System.out.println("Creating nokia power charge in progress...");
        employee.makePowerCharge();
    }
}
