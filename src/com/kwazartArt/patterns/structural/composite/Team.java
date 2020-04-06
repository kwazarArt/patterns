package com.kwazartArt.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Scientist> dreamTeam = new ArrayList<>();

    public void addScientist(Scientist scientist) {
        dreamTeam.add(scientist);
    }

    public void removeScientist(Scientist scientist) {
        dreamTeam.remove(scientist);
    }

    public void createVaccineToCovid() {
        System.out.println("Creating a vaccine in progress...\n\n");
        for (Scientist scientist : dreamTeam) {
            scientist.lookingForAntiStaff();
        }
    }
}
