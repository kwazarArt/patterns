package com.kwazartArt.patterns.creational.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();

        constructor.setBuilder(new PremiumCarBuilder());
        Car car = constructor.buildCar();
        System.out.println(car);
    }
}
