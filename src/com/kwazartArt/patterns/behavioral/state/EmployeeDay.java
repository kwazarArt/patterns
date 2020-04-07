package com.kwazartArt.patterns.behavioral.state;

public class EmployeeDay {
    public static void main(String[] args) {
        Job job = new StartWork();
        Employee employee = new Employee();

        employee.setJob(job);

        for (int i = 0; i < 10; i++) {
            employee.doJob();
            employee.changeStageJob();
        }
    }
}
