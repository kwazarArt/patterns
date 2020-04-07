package com.kwazartArt.patterns.behavioral.visitor;

public class ManagerWithExp implements Employee {
    @Override
    public void doStage(ProjectBuilding projectBuilding) {
        System.out.println("Makes correct calculating...");
    }

    @Override
    public void doStage(CallToClient callToClient) {
        System.out.println("Speaks very interested");
    }

    @Override
    public void doStage(ViewBuilding viewBuilding) {
        System.out.println("Views right object");
    }
}
