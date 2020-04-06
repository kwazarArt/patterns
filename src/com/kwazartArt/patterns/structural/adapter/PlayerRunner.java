package com.kwazartArt.patterns.structural.adapter;

public class PlayerRunner {
    public static void main(String[] args) {
        Player player = new AdapterGamepadToPlayer();

        player.moveStraightOn();
        player.turnLeft();
        player.turnRight();
        player.turnBack();
    }
}
