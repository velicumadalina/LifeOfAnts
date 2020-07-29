package com.codecool.ants;

import java.util.Random;

public class Drone extends Ant {
    boolean isAfterMating = false;
    int postMatingCountdown = 0;
    Random random = new Random();

    public Drone() {
        this.typeOfAnt = "Drone";
        this.positionX = random.nextInt(100);
        this.positionY = random.nextInt(100);
        this.stepX = 1;
        this.stepY = 1;
    }


    @Override
    public void makeStep(int stepNum) {
        if (!isAfterMating) {
            mate(Queen.getQueenMood());
            if (stepNum % 2 == 0) {
                if (getDistanceToQueenX() > 0) {
                    positionX += stepX;
                    System.out.println(typeOfAnt + " moved 1 step to the right");
                } else {
                    positionX -= stepX;
                    System.out.println(typeOfAnt + " moved 1 step to the left");
                }
                System.out.println(typeOfAnt + " is at position x " + positionX);
                System.out.println(typeOfAnt + " is at position y " + positionY);
            } else {
                if (getDistanceToQueenY() > 0) {
                    positionY += stepY;
                    System.out.println(typeOfAnt + " moved 1 step to the north");
                } else {
                    positionY -= stepY;
                    System.out.println(typeOfAnt + " moved 1 step to the south");
                }
                System.out.println(typeOfAnt + " is at position x " + positionX);
                System.out.println(typeOfAnt + " is at position y " + positionY);
            }
        } else {
            if (postMatingCountdown > 0) {
                postMatingCountdown--;
            } else {
                isAfterMating = false;
            }
        }
    }

    public void mate(boolean queenMood) {
        if (getDistanceToQueenX() == 3 || getDistanceToQueenY() == 3) {
            if (queenMood) {
                System.out.println("HALLELUJAH!");
                isAfterMating = true;
                postMatingCountdown = 10;
            } else {
                System.out.println("D'OH!");
                if (getDistanceToQueenX() == 3 || getDistanceToQueenY() == 3) {
                    positionX = 0;
                    positionY = 0;
                }
            }
        }
    }

    @Override
    public int getDistanceToQueenX() {
        return Queen.getQueenPositionX() - positionX;
    }

    @Override
    public int getDistanceToQueenY() {
        return Queen.getQueenPositionY() - positionY;
    }

    @Override
    public String getTypeOfAnt() {
        return typeOfAnt;
    }
}
