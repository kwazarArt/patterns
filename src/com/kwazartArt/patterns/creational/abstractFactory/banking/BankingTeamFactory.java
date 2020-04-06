package com.kwazartArt.patterns.creational.abstractFactory.banking;

import com.kwazartArt.patterns.creational.abstractFactory.Developer;
import com.kwazartArt.patterns.creational.abstractFactory.ProjectManager;
import com.kwazartArt.patterns.creational.abstractFactory.ProjectTeamFactory;
import com.kwazartArt.patterns.creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
