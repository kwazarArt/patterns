package com.kwazartArt.patterns.behavioral.visitor;

public class Building implements BuildingPart {
    BuildingPart[] buildingParts;

    public Building() {
        this.buildingParts = new BuildingPart[] {
                new ProjectBuilding(),
                new CallToClient(),
                new ViewBuilding()
        };
    }

    @Override
    public void beDone(Employee employee) {
        for (BuildingPart bp : buildingParts) {
            bp.beDone(employee);
        }
    }
}
