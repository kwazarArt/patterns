package com.kwazartArt.patterns.behavioral.state;

public class StartWork implements Job {
    @Override
    public void doJob() {
        System.out.println("Beginning work...");
    }
}
