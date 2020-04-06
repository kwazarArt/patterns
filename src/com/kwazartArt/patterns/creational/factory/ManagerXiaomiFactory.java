package com.kwazartArt.patterns.creational.factory;

public class ManagerXiaomiFactory implements ManagerFactory {
    @Override
    public Manager createManager() {
        return new ManagerXiaomi();
    }
}
