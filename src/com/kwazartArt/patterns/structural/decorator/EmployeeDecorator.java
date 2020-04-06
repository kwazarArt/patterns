package com.kwazartArt.patterns.structural.decorator;

public class EmployeeDecorator implements Employee {

    Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDecorator() {
    }

    @Override
    public String makeJob() {
        if (employee != null)
            return employee.makeJob();
        return "";
    }
}
