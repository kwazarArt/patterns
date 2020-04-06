package com.kwazartArt.patterns.creational.builder;

public class DeliveryCarBuilder extends CarBuilder {
    @Override
    void buildModel() {
        car.setModel("S90");
    }

    @Override
    void buildCompany() {
        car.setCompany(Company.VOLVO);
    }

    @Override
    void buildTypcCar() {
        car.setTypeCar(TypeCar.CROSSOVER);
    }

    @Override
    void buildPrice() {
        car.setPrice(2400000);
    }
}
