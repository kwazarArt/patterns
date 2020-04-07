package com.kwazartArt.patterns.behavioral.strategy;

import com.kwazartArt.patterns.behavioral.state.Job;

public class MainWork implements Job {
    @Override
    public void doJob() {
        System.out.println("Working main block...");
    }
}
