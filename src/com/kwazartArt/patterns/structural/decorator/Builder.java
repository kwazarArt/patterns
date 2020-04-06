package com.kwazartArt.patterns.structural.decorator;

public class Builder implements Employee {
    @Override
    public String makeJob() {
        return " build tower";
    }
}
