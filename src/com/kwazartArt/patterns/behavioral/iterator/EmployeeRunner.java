package com.kwazartArt.patterns.behavioral.iterator;

public class EmployeeRunner {
    public static void main(String[] args) {
        String[] departments = {"hr", "pr", "top", "lohystic"};
        Employee employee = new Employee(10, departments);

        Iterator iterator = employee.getIterator();
        System.out.println("Employee - id: " + employee.getId());
        System.out.println("Departments:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
