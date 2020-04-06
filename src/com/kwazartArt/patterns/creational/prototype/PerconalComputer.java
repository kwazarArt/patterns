package com.kwazartArt.patterns.creational.prototype;

public class PerconalComputer implements Copyable{
    private String model;
    private FormFactor formFactor;
    private String hardware;

    public PerconalComputer(String model, FormFactor formFactor, String hardware) {
        this.model = model;
        this.formFactor = formFactor;
        this.hardware = hardware;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    @Override
    public Object copy() {
        PerconalComputer copy = new PerconalComputer(model, formFactor, hardware);
        return copy;
    }

    @Override
    public String toString() {
        return "PerconalComputer{" +
                "model='" + model + '\'' +
                ", formFactor=" + formFactor +
                ", hardware='" + hardware + '\'' +
                '}';
    }
}
