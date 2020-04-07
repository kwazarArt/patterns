package com.kwazartArt.patterns.behavioral.state;

public class Employee {
    Job job;

    public void setJob(Job job) {
        this.job = job;
    }

    public void changeStageJob() {
        if (job instanceof StartWork) {
            setJob(new MainWork());
        } else if (job instanceof MainWork) {
            setJob(new AnalyzeWork());
        } else if (job instanceof AnalyzeWork) {
            setJob(new FinishWork());
        } else if (job instanceof FinishWork) {
            setJob(new StartWork());
        }
    }

    public void doJob() {
        job.doJob();
    }
}
