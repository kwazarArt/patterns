package com.kwazartArt.patterns.structural.proxy;

public class EmployeeRunner {
    public static void main(String[] args) {
        PowerCharge powerCharge = new ProxyPowerCharge("Nokia");

        powerCharge.create();
    }
}
