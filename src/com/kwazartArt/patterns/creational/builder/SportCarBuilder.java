package com.kwazartArt.patterns.creational.builder;

public class SportCarBuilder extends CarBuilder {
    @Override
    void buildModel() {
        car.setModel("TT");
    }

    @Override
    void buildCompany() {
        car.setCompany(Company.AUDI);
    }

    @Override
    void buildTypcCar() {
        car.setTypeCar(TypeCar.SEDAN);
    }

    @Override
    void buildPrice() {
        car.setPrice(2900000);
    }
}
