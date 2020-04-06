package com.kwazartArt.patterns.creational.builder;

public class PremiumCarBuilder extends CarBuilder{

    @Override
    void buildModel() {
        car.setModel("M3");
    }

    @Override
    void buildCompany() {
        car.setCompany(Company.BMW);
    }

    @Override
    void buildTypcCar() {
        car.setTypeCar(TypeCar.SEDAN);
    }

    @Override
    void buildPrice() {
        car.setPrice(3150000);
    }
}
