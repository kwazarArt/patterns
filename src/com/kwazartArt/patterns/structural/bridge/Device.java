package com.kwazartArt.patterns.structural.bridge;

public abstract class Device {
    protected Employee employee;

    protected Device(Employee employee) {
        this.employee = employee;
    }

    public abstract void createDevice();
}
