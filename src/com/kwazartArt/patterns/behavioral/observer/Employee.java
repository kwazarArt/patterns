package com.kwazartArt.patterns.behavioral.observer;

import java.util.List;

public class Employee implements Observer {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void processTasks(List<String> tasks) {
        System.out.println(name + " there are some tasks for you.\n" + tasks);
    }
}
