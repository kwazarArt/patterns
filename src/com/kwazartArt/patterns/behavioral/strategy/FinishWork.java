package com.kwazartArt.patterns.behavioral.strategy;

import com.kwazartArt.patterns.behavioral.state.Job;

public class FinishWork implements Job {
    @Override
    public void doJob() {
        System.out.println("Finish work...");
    }
}
