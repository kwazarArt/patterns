package com.kwazartArt.patterns.behavioral.visitor;

public class ManagerWithoutExp implements Employee {
    @Override
    public void doStage(ProjectBuilding projectBuilding) {
        System.out.println("Do wrong calculating...");
    }

    @Override
    public void doStage(CallToClient callToClient) {
        System.out.println("Speaks very boring...");
    }

    @Override
    public void doStage(ViewBuilding viewBuilding) {
        System.out.println("Views other object...");
    }
}
