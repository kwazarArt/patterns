package com.kwazartArt.patterns.creational.abstractFactory.banking;

import com.kwazartArt.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java Code...");
    }
}
