package com.kwazartArt.patterns.structural.decorator;

public class GeneralManager extends EmployeeDecorator {

    public GeneralManager(Employee employee) {
        super(employee);
    }

    public String thinkAboutNewProject() {
        return " Think about new project";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + thinkAboutNewProject();
    }
}
