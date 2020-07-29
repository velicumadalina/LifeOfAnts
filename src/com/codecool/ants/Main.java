package com.codecool.ants;

public class Main {

    private static void createAnts(Colony colony) {
        for (int i = 0; i < 1; i++) {
            Drone newDrone = new Drone();
            colony.addAntToColony(newDrone);
            Worker newWorker = new Worker();
            colony.addAntToColony(newWorker);
            Soldier newSoldier = new Soldier();
            colony.addAntToColony(newSoldier);
        }
        Queen theOneAndOnlyQueen = new Queen();
        colony.addAntToColony(theOneAndOnlyQueen);
    }


    public static void main(String[] args) {
        Colony colony = new Colony();
        createAnts(colony);
        colony.simulateLife(100);
    }
}
