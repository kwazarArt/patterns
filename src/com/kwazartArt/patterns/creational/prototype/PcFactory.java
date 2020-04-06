package com.kwazartArt.patterns.creational.prototype;

public class PcFactory {
    PerconalComputer perconalComputer;

    public PcFactory(PerconalComputer perconalComputer) {
        this.perconalComputer = perconalComputer;
    }

    public void setPerconalComputer(PerconalComputer perconalComputer) {
        this.perconalComputer = perconalComputer;
    }

    PerconalComputer clonePC() {
        return (PerconalComputer) perconalComputer.copy();
    }
}
