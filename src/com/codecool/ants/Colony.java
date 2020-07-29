package com.codecool.ants;
import com.codecool.ants.Ant;

import java.util.ArrayList;
import java.util.Random;

public class Colony {
    Random random = new Random();
    ArrayList<Ant> livingAnts = new ArrayList<>();

    public void addAntToColony(Ant ant){
        livingAnts.add(ant);
    }

    public Colony(){

    }

    public void simulateLife(int timesteps){
        for(int i = 0; i<timesteps; i++) {
            boolean mood = random.nextBoolean();
            Queen.setMatingMood(mood);
            if(mood){
                System.out.println("THE QUEEN WANTS TO MATE!");
            }
            for(Ant ant: livingAnts){
                ant.makeStep(i);
            }
        }
    }
}
