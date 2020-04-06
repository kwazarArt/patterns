package com.kwazartArt.patterns.creational.factory;

public class ManagerSamsungFactory implements ManagerFactory {
    @Override
    public Manager createManager() {
        return new ManagerSamsung();
    }
}
