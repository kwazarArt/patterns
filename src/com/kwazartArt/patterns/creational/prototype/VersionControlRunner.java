package com.kwazartArt.patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        PerconalComputer master = new PerconalComputer("HomeStation", FormFactor.FULLSIZE, "4650k, 1080i, 256 EVO, Z250, 750W, 4x8");
        System.out.println(master);

        PcFactory factory = new PcFactory(master);
        PerconalComputer masterClone = factory.clonePC();
        System.out.println(masterClone);
    }
}
