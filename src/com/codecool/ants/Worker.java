package com.codecool.ants;

import java.util.Random;

public class Worker extends Ant {
    Random random = new Random();

    public Worker() {
        this.typeOfAnt = "Worker";
        this.positionX = random.nextInt(100);
        this.positionY = random.nextInt(100);
        this.stepX = 1;
        this.stepY = 1;
    }


    @Override
    public void makeStep(int stepNum) {
        int choice = random.nextInt(100);
        if (choice % 2 == 0) {
            if (choice <= 50 && positionX < 100 && positionX > 0) {
                positionX -= stepX;
                System.out.println(typeOfAnt + " moved 1 step to the left");
            } else {
                positionX += stepX;
                System.out.println(typeOfAnt + " moved 1 step to the right");
            }
        } else {
            if (choice <= 50 && positionY < 100 && positionY > 0) {
                positionY -= stepY;
                System.out.println(typeOfAnt + " moved 1 step to the south");
            }
            else{
                positionY += stepY;
                System.out.println(typeOfAnt + " moved 1 step to the north");
            }
        }
    }

    @Override
    public int getDistanceToQueenX() {
        return 0;
    }

    @Override
    public int getDistanceToQueenY() {
        return 0;
    }


    @Override
    public String getTypeOfAnt() {
        return typeOfAnt;
    }
}
