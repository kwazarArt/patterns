package com.kwazartArt.patterns.creational.abstractFactory.website;

import com.kwazartArt.patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes Php code...");
    }
}
