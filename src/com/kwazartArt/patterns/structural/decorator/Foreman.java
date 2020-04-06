package com.kwazartArt.patterns.structural.decorator;

public class Foreman extends EmployeeDecorator {

    public Foreman(Employee employee) {
        super(employee);
    }

    public Foreman() {
    }

    public String checkDesign() {
        return " Check project design.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + checkDesign();
    }
}
