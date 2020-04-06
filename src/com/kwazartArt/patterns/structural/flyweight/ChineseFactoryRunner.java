package com.kwazartArt.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ChineseFactoryRunner {
    public static void main(String[] args) {
        EmployeesFactory employeesFactory = new EmployeesFactory();
        List<Employee> employees = new ArrayList<>();

        employees.add(employeesFactory.getDeveloperBySpecialty("nokia"));
        employees.add(employeesFactory.getDeveloperBySpecialty("nokia"));
        employees.add(employeesFactory.getDeveloperBySpecialty("nokia"));
        employees.add(employeesFactory.getDeveloperBySpecialty("nokia"));
        employees.add(employeesFactory.getDeveloperBySpecialty("nokia"));
        employees.add(employeesFactory.getDeveloperBySpecialty("nokia"));
        employees.add(employeesFactory.getDeveloperBySpecialty("nokia"));
        employees.add(employeesFactory.getDeveloperBySpecialty("siemens"));
        employees.add(employeesFactory.getDeveloperBySpecialty("siemens"));
        employees.add(employeesFactory.getDeveloperBySpecialty("siemens"));
        employees.add(employeesFactory.getDeveloperBySpecialty("siemens"));
        employees.add(employeesFactory.getDeveloperBySpecialty("siemens"));
        employees.add(employeesFactory.getDeveloperBySpecialty("siemens"));
        employees.add(employeesFactory.getDeveloperBySpecialty("siemens"));

        for (Employee employee : employees) {
            System.out.println(employee);
            employee.createPowerCharge();
        }
    }
}
