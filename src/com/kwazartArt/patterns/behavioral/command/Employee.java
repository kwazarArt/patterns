package com.kwazartArt.patterns.behavioral.command;

public class Employee {
    Command design;
    Command create;
    Command pack;
    Command send;

    public Employee(Command design, Command create, Command pack, Command send) {
        this.design = design;
        this.create = create;
        this.pack = pack;
        this.send = send;
    }

    public void designPowerCharge() {
        design.execute();
    }

    public void createPowerCharge() {
        create.execute();
    }

    public void packPowerCharge() {
        pack.execute();
    }

    public void sendPowerCharge() {
        send.execute();
    }
}
