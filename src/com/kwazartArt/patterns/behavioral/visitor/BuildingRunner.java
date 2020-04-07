package com.kwazartArt.patterns.behavioral.visitor;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building = new Building();

        Employee ManWithoutExp = new ManagerWithoutExp();
        Employee ManWithExp = new ManagerWithExp();

        System.out.println("Manager without experience...");
        building.beDone(ManWithoutExp);
        System.out.println("\n======================\n");
        System.out.println("Manager with experience...");
        building.beDone(ManWithExp);
    }
}
