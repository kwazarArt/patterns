package com.kwazartArt.patterns.creational.builder;

public class Constructor {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildModel();
        builder.buildCompany();
        builder.buildTypcCar();
        builder.buildPrice();

        Car car = builder.getCar();
        return car;
    }
}
