package com.kwazartArt.patterns.structural.facade;

public class WorkDay {
    public static void main(String[] args) {
        Details details = new Details();
        details.makeDetail();

        Production production = new Production();
        production.startConveyor();
        Employee employee = new Employee();
        employee.makeDetailBeforeStopConveyor(production);

        production.finishConveyor();
        employee.makeDetailBeforeStopConveyor(production);
    }
}
