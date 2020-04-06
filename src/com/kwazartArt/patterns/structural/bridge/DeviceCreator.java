package com.kwazartArt.patterns.structural.bridge;

public class DeviceCreator {
    public static void main(String[] args) {
        Device [] devices = {
                new NokiaPowerChargeDevice(new EmployeeChuHao()),
                new SiemensPowerChargeDevice(new EmployeeLeeSun())
        };

        for (Device device : devices) {
            device.createDevice();
        }
    }
}
