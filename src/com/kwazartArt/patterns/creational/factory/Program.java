package com.kwazartArt.patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        ManagerFactory managerFactory = createManagerFactoryBySpecialty("Xiaomi");
        Manager manager = managerFactory.createManager();
        manager.manage();
    }

    static ManagerFactory createManagerFactoryBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("Apple")) {
            return new ManagerAppleFactory();
        } else if (specialty.equalsIgnoreCase("Samsung")) {
            return new ManagerSamsungFactory();
        } else if(specialty.equalsIgnoreCase("xiaomi")) {
            return new ManagerXiaomiFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown.");
        }
    }
}
