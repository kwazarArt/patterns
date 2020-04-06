package com.kwazartArt.patterns.structural.bridge;

public class SiemensPowerChargeDevice extends Device {

    public SiemensPowerChargeDevice(Employee employee) {
        super(employee);
    }

    @Override
    public void createDevice() {
        System.out.println("Creating siemens power charge in progress... ");
        employee.makePowerCharge();
    }
}
