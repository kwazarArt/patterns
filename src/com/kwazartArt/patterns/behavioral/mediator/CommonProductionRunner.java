package com.kwazartArt.patterns.behavioral.mediator;

public class CommonProductionRunner {
    public static void main(String[] args) {
        CommonProduction commonProduction = new CommonProduction();
        Employee employee1 = new Employee("Li Chun");
        Employee employee2 = new Employee("Vu Kwong");
        Employee employee3 = new Employee("Sun Lun");
        Employee employee4 = new Employee("Tien Vu");

        commonProduction.addEmployee(employee1);
        commonProduction.addEmployee(employee2);
        commonProduction.addEmployee(employee3);
        commonProduction.addEmployee(employee4);

        commonProduction.sendCommand(employee1);
        commonProduction.sendCommand(employee3);

    }
}
