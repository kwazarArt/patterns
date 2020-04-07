package com.kwazartArt.patterns.behavioral.strategy;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setJob(new StartWork());
        employee.executeJob();

        employee.setJob(new MainWork());
        employee.executeJob();

        employee.setJob(new AnalyzeWork());
        employee.executeJob();

        employee.setJob(new FinishWork());
        employee.executeJob();

        employee.setJob(new StartWork());
        employee.executeJob();
    }
}
