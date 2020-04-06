package com.kwazartArt.patterns.creational.builder;

public abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }

    abstract void buildModel();
    abstract void buildCompany();
    abstract void buildTypcCar();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
