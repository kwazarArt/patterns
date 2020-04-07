package com.kwazartArt.patterns.behavioral.state;

public class FinishWork implements Job {
    @Override
    public void doJob() {
        System.out.println("Finish work...");
    }
}
