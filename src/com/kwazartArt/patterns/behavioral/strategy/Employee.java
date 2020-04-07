package com.kwazartArt.patterns.behavioral.strategy;

import com.kwazartArt.patterns.behavioral.state.Job;

public class Employee {
    Job job;

    public void setJob(Job job) {
        this.job = job;
    }

    public void executeJob() {
        job.doJob();
    }

    public void doJob() {
        job.doJob();
    }
}
