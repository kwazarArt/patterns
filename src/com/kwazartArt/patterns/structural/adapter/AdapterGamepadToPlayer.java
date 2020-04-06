package com.kwazartArt.patterns.structural.adapter;

public class AdapterGamepadToPlayer extends Gamepad implements Player {
    @Override
    public void moveStraightOn() {
        actionForward();
    }

    @Override
    public void turnLeft() {
        actionLeft();
    }

    @Override
    public void turnRight() {
        actionRight();
    }

    @Override
    public void turnBack() {
        actionBack();
    }
}
