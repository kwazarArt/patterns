package com.kwazartArt.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class CommonProduction implements Production{
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void sendCommand(Employee employee) {
        for (Employee e : employees) {
            if (e != employee) {
                e.relax();

            } else {
                e.work();
            }
        }
        System.out.println("========================\n");
    }
}
