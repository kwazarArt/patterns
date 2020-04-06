package com.kwazartArt.patterns.creational.abstractFactory.website;

import com.kwazartArt.patterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests Website...");
    }
}
