package com.kwazartArt.patterns.creational.builder;

public class Car {
    private String model;
    private Company company;
    private TypeCar typeCar;
    private int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", company=" + company +
                ", typeCar=" + typeCar +
                ", car=" + price +
                '}';
    }
}
