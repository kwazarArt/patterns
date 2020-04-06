package com.kwazartArt.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeesFactory {
    private static final Map<String, Employee> employees = new HashMap<>();

    public Employee getDeveloperBySpecialty(String specialty) {
        Employee employee = employees.get(specialty);

        if (employee == null) {
            switch (specialty) {
                case "nokia":
                    System.out.println("Hiring Su Kwong...");
                    employee = new EmployeeSuKwong();
                    break;
                case "siemens":
                    System.out.println("Hiring Lee Chong...");
                    employee = new EmployeeLeeChong();
            }
            employees.put(specialty, employee);
        }
        return employee;
    }
}
