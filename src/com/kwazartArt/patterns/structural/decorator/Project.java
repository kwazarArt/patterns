package com.kwazartArt.patterns.structural.decorator;

public class Project {
    public static void main(String[] args) {
        Employee employee = new Foreman(new Builder());
        Employee manager = new GeneralManager(new Foreman());

        System.out.println(employee.makeJob());
        System.out.println(manager.makeJob());
    }
}
