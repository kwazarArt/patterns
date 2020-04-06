package com.kwazartArt.patterns.creational.factory;

public class ManagerAppleFactory implements ManagerFactory {
    @Override
    public Manager createManager() {
        return new ManagerApple();
    }
}
