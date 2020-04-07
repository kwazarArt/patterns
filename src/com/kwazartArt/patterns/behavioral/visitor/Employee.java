package com.kwazartArt.patterns.behavioral.visitor;

public interface Employee {
    public void doStage(ProjectBuilding projectBuilding);

    public void doStage(CallToClient callToClient);

    public void doStage(ViewBuilding viewBuilding);
}
