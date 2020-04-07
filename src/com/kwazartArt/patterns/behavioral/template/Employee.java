package com.kwazartArt.patterns.behavioral.template;

public abstract class Employee {
    protected void doWork() {
        System.out.println("Start work");
        System.out.println("Do main part");
        goLanch();
    }

    protected abstract void goLanch();
}
