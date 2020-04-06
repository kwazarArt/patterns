package com.kwazartArt.patterns.structural.proxy;

public class ProxyPowerCharge implements PowerCharge{
    private String ideaName;
    private RealPowerCharge realPowerCharge;

    public ProxyPowerCharge(String ideaName) {
        this.ideaName = ideaName;
    }

    @Override
    public void create() {
        if (realPowerCharge == null) {
            realPowerCharge = new RealPowerCharge(ideaName);
        }
        realPowerCharge.create();
    }
}
