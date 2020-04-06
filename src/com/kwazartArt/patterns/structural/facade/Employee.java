package com.kwazartArt.patterns.structural.facade;

public class Employee {
    public void makeDetailBeforeStopConveyor(Production production) {
        if (production.isActiveConveyor()) {
            System.out.println("Employee makes details...");
        } else {
            System.out.println("Employee is smoking...");
        }
    }
}
