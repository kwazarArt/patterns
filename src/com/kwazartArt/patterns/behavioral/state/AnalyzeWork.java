package com.kwazartArt.patterns.behavioral.state;

public class AnalyzeWork implements Job {
    @Override
    public void doJob() {
        System.out.println("Analyzing completed work...");
    }
}
