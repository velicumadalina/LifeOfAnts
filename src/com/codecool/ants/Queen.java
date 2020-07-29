package com.codecool.ants;

import java.util.Random;

public class Queen extends Ant {
    static boolean matingMood = false;
    private static int positionX;
    private static int positionY;
    Random random = new Random();

    public Queen() {
        this.typeOfAnt = "Queen";
        positionX = 100;
        positionY = 100;
        this.stepX = 0;
        this.stepY = 0;

    }

    public static boolean getQueenMood(){
        return matingMood;
    }

    @Override
    public void makeStep(int stepNum) {
        positionY += stepY;
        positionX += stepX;
    }

    @Override
    public int getDistanceToQueenX() {
        return 0;
    }

    @Override
    public int getDistanceToQueenY() {
        return 0;
    }


    public static void setMatingMood(boolean mood){
        matingMood = mood;
    }

    public boolean getMatingMood(){
        return matingMood;
    }

    public static int getQueenPositionX(){
        return positionX;
    }

    public static int getQueenPositionY(){
        return positionY;
    }

    @Override
    public String getTypeOfAnt() {
        return typeOfAnt;
    }
}
