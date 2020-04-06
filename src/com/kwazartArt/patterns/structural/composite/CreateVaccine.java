package com.kwazartArt.patterns.structural.composite;

public class CreateVaccine {
    public static void main(String[] args) {
        Team lastHopeTeam = new Team();

        Scientist firstChemist = new Chemist();
        Scientist secondChemist = new Chemist();
        Scientist thirdChemist = new Chemist();
        Scientist firstBiologist = new Biologist();
        Scientist secondBiologist = new Biologist();

        lastHopeTeam.addScientist(firstChemist);
        lastHopeTeam.addScientist(secondChemist);
        lastHopeTeam.addScientist(thirdChemist);
        lastHopeTeam.addScientist(firstBiologist);
        lastHopeTeam.addScientist(secondBiologist);

        lastHopeTeam.createVaccineToCovid();
    }
}
