package com.kwazartArt.patterns.behavioral.mediator;

public class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(getName() + " works...");
    }

    public void relax() {
        System.out.println(getName() + " relaxes...");
    }
}
